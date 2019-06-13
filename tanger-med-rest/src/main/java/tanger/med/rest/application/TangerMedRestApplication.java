package tanger.med.rest.application;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import tanger.med.rest.api.DemoRestApi;
import tanger.med.rest.provider.ServiceContextProvider;


/**
 * @author oharrari
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/tangerMed",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=tangerMed.Rest",
		"liferay.auth.verifier=false", 
		"liferay.oauth2=false",
		"auth.verifier.guest.allowed=true",
		"auth.verifier.auth.verifier.OAuth2RestAuthVerifier.urls.includes=*",
		"auth.verifier.auth.verifier.PortalSessionAuthVerifier.urls.includes=*",
		"oauth2.scopechecker.type=annotations"
	},
	service = Application.class
)
public class TangerMedRestApplication extends Application {

	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		singletons.add(new JacksonJsonProvider());
		singletons.add(_serviceContextProvider);
		singletons.add(demoRestApi);

		return singletons;
	}

	@Reference
	DemoRestApi demoRestApi;
    
	@Reference
	ServiceContextProvider _serviceContextProvider;
	
}