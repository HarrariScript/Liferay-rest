package tanger.med.rest.service;

import com.liferay.oauth2.provider.scope.RequiresNoScope;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import tanger.med.core.service.TMessageService;
import tanger.med.rest.api.DemoRestApi;


@Component(service = DemoRestApi.class)

public class DemoRestApiImpl implements DemoRestApi{
	Log _log = LogFactoryUtil.getLog(DemoRestApiImpl.class);
	
	@RequiresNoScope
	@Override
	public String working(ServiceContext serviceContext ) {
		_tMessageService.getAllTMessage(serviceContext);
		
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("message", "hello world ");
		return jsonObject.toString();
	}
	
	@Reference 
	TMessageService _tMessageService ;
	
 
}
