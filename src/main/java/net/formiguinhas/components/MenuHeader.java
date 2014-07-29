// Generated by the Maven Archetype Plug-in
package net.formiguinhas.components;

import org.apache.log4j.Logger;

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.directtoweb.*;

import er.extensions.appserver.navigation.ERXNavigationManager;
import er.extensions.appserver.navigation.ERXNavigationState;

public class MenuHeader extends WOComponent {

	private static final Logger log = Logger.getLogger(MenuHeader.class);
    public String entityNameInList;
    private String _manipulatedEntityName;

	public static String TITULO_DA_APLICACAO = "D2W_Titulo_da_Aplicacao";

    public MenuHeader(WOContext aContext) {
        super(aContext);
    }


	// ERXModernNavigationMenu Support

	public NSKeyValueCoding navigationContext() {

		NSKeyValueCoding context = (NSKeyValueCoding) session().objectForKey(
				"navigationContext");

		if (context().page() instanceof D2WPage) {
			context = ((D2WPage) context().page()).d2wContext();
		}

		log.debug(ERXNavigationManager.manager().navigationStateForSession(session()));
		if (context == null) {
			context = new NSMutableDictionary<Object, String>();
			session().setObjectForKey(context, "navigationContext");
		}
		@SuppressWarnings("unused")
		ERXNavigationState state = ERXNavigationManager.manager()
				.navigationStateForSession(session());
		log.debug("NavigationState:" + state + "," + state.state() + "," +
		state.stateAsString());
		log.info("navigationContext:" +
		session().objectForKey("navigationContext"));
		return context;
	}

	// Actions

	public WOComponent logout() {
		WOComponent redirectPage = pageWithName("WORedirect");
		((WORedirect) redirectPage).setUrl(D2W.factory().homeHrefInContext(
				context()));
		session().terminate();
		return redirectPage;
	}

	public WOComponent homeAction() {
		return D2W.factory().defaultPage(session());
	}

	public NSKeyValueCoding d2wContext() {
		return ((D2WPage) context().page()).d2wContext();
	}


	public String tituloAplicacao() {

		return (String)  ((D2WPage) context().page()).d2wContext().valueForKey(TITULO_DA_APLICACAO);
	}
}