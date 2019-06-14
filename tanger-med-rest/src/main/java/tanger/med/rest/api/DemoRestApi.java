package tanger.med.rest.api;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import tanger.med.core.model.TMessage;
import tanger.med.rest.api.model.TMessageModel;


@Path("/")
public interface DemoRestApi {
	
	@GET
	@Path("/test")
	@Produces({"application/json"})
	public List<TMessage> working(@Context ServiceContext serviceContext ) ;
	
	
	@POST
	@Path("/test")
	@Consumes({ "multipart/form-data" })
	@Produces({"application/json"})
	
	public TMessageModel addTMessage(@FormParam("title") String title , @FormParam("content") String content , @Context ServiceContext serviceContext );
	
	
}
