// Generated by the Maven Archetype Plug-in
package net.formiguinhas.components;

import org.apache.log4j.Logger;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.D2WPage;
import com.webobjects.directtoweb.D2WContext;

public class PageWrapper extends WOComponent {

	private static final Logger log = Logger.getLogger(PageWrapper.class);


    public PageWrapper(WOContext aContext) {
        super(aContext);
    }
    public D2WContext d2wContext() {
    	if (context().page() instanceof D2WPage) {
			D2WPage d2wPage = (D2WPage) context().page();
			return d2wPage.d2wContext();
		}
    	return null;
    }

	public String bodyClass() {
		String result = null;
		String pageConfig = (String)d2wContext().valueForKey("pageConfiguration");
		if (pageConfig != null && pageConfig.length() > 0) {
			result = pageConfig + "Body";
		}
		return result;
	}

	@Override
	public void appendToResponse(WOResponse response, WOContext context) {

		//ERXResponseRewriter.addScriptResourceInHead(response, context, "app", "js/jquery-1.10.2.min.js");
		//ERXResponseRewriter.addScriptResourceInHead(response, context, "app", "js/jquery-noconflict.js");

		super.appendToResponse(response, context);


	}
}
