package tanger.med.rest.api.model.mapper;

import org.osgi.service.component.annotations.Component;

import tanger.med.core.model.TMessage;
import tanger.med.rest.api.model.TMessageModel;

@Component(immediate = true, service = TMessageModelMapperService.class)

public class TMessageModelMapperService {
	
	public TMessageModel fromTMessage(TMessage tMessage) {
		TMessageModel messageModel = new TMessageModel();
		messageModel.setTitle(tMessage.getTitle());
		messageModel.setContent(tMessage.getContent());
		messageModel.setMessageId(tMessage.getMessageId());
		
		return messageModel ; 
	}

}
