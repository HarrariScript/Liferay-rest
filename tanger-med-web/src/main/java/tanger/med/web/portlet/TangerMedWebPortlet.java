package tanger.med.web.portlet;

import tanger.med.web.constants.TangerMedWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author oharrari
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TangerMedWebPortletKeys.TangerMedWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.add-default-resource=true",
		"javax.portlet.version=3.0"
		
	},
	service = Portlet.class
)
public class TangerMedWebPortlet extends MVCPortlet {
}