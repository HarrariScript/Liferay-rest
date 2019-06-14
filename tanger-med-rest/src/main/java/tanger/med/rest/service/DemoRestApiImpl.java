package tanger.med.rest.service;

import com.liferay.oauth2.provider.scope.RequiresNoScope;
import com.liferay.oauth2.provider.scope.RequiresScope;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import tanger.med.core.model.TMessage;
import tanger.med.core.service.TMessageService;
import tanger.med.rest.api.DemoRestApi;
import tanger.med.rest.api.model.TMessageModel;
import tanger.med.rest.api.model.mapper.*;

@Component(service = DemoRestApi.class)

public class DemoRestApiImpl implements DemoRestApi{
	Log _log = LogFactoryUtil.getLog(DemoRestApiImpl.class);
	
	@RequiresScope("tangermed.read")
	@Override
	public List<TMessageModel> working(ServiceContext serviceContext ) {
		List<TMessage> tMessageList = _tMessageService.getAllTMessage(serviceContext);
		List<TMessageModel> tMessageModelList = new ArrayList<TMessageModel>();
		for(TMessage tMessage : tMessageList) {
			tMessageModelList.add(_tMessageModelMapperService.fromTMessage(tMessage));
		}
		return tMessageModelList;
	}
	
	@Reference 
	TMessageService _tMessageService ;
	
	@Reference
	TMessageModelMapperService _tMessageModelMapperService;
	@RequiresScope("tangermed.admin")
	@Override
	public TMessageModel addTMessage(String title, String content, ServiceContext serviceContext) {
		_log.info(title);
		_log.info(content);
		return  _tMessageModelMapperService.fromTMessage(_tMessageService.addTMessage(title , content , serviceContext));
		
		
	}
	
 
}
