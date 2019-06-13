package tanger.med.rest.api;
import com.liferay.portal.kernel.service.ServiceContext;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import tanger.med.core.model.TMessage;


@Path("/")
public interface DemoRestApi {
	
	@GET
	@Path("/test")
	@Produces({"application/json"})
	public String working(@Context ServiceContext serviceContext ) ;
	
	
	/*@POST
	@Path("/test")
	@Consumes({ "multipart/form-data" })
	@Produces({"application/json"})
	
	public boolean addTMessage() */
	
	
}
