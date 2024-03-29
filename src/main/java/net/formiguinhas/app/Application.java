// Generated by the Maven Archetype Plug-in
package net.formiguinhas.app;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.log4j.Logger;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOResponse;
import com.webobjects.appserver.WOSession;
import com.webobjects.eoaccess.EOModel;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;

import er.corebl.ERCoreBL;
import er.extensions.appserver.ERXApplication;
import er.extensions.appserver.navigation.ERXNavigationManager;
import er.extensions.foundation.ERXPatcher;
import er.extensions.foundation.ERXProperties;
import er.extensions.localization.ERXLocalizer;
import er.rest.routes.ERXRouteRequestHandler;
import moleque.webobjects.extensions.localization.MOLLocalizer;
import net.formiguinhas.components.Main;
import net.formiguinhas.negocios.Usuario;

public class Application extends ERXApplication {

	private static final Logger log = Logger.getLogger(Application.class);

	private String versao;


	/**
	 * @return the versao
	 */
	public String getVersao() {
		return versao;
	}

	/**
	 * @param versao the versao to set
	 */
	public void setVersao(String versao) {
		this.versao = versao;
	}


	private void inicializarControllers() {
		// configurar as interfaces REST
		// APENAS PARA TESTES E EXPERIMENTAÇÕES
//		registerRequestHandler(ERXRestRequestHandler.createUnsafeRequestHandler(true, false), "rest");

		// CONFIGURAÇÃO REAL
//		ERXRestNameRegistry.registry().setExternalNameForInternalName("assessment", PessoaFisica.ENTITY_NAME);

		ERXRouteRequestHandler routeRequestHandler = new ERXRouteRequestHandler();
		//registarAssessmentTheoreticalController(routeRequestHandler);
		//registarAssessmentPracticalController(routeRequestHandler);
//		routeRequestHandler.addRoute(new ERXRoute(Usuario.ENTITY_NAME, "/user/updateByLogin/{login:String}/{inst:Integer}", ERXRoute.Method.Put, "UsuarioController", "updateByLogin"));
//		routeRequestHandler.addRoute(new ERXRoute(Usuario.ENTITY_NAME, "/users/listUsersEnabled/{indexMin:Integer}/{indexMax:Integer}", ERXRoute.Method.Get, "UsuarioController", "listUsersEnabled"));
//		routeRequestHandler.addRoute(new ERXRoute(Usuario.ENTITY_NAME, "/users/countUsersEnabled", ERXRoute.Method.Get, "UsuarioController", "countUsersEnabled"));

		//routeRequestHandler.addRoutes(Usuario.ENTITY_NAME);

		// Register the request handler with the application -- it becomes the "ra" request handler
		ERXRouteRequestHandler.register(routeRequestHandler);

	}


	public Application() {
		super();
		log.info("Bemvindo a " + name() + " !");
		setDefaultRequestHandler(requestHandlerForKey(directActionRequestHandlerKey()));

		if (isDirectConnectEnabled()) {
			registerRequestHandler(new JarResourceRequestHandler(), "_wr_");

			if (ERXApplication.isWO54()) {
				registerRequestHandler(new JarResourceRequestHandler(), "wr");
			}
		}

		NSArray models = EOModelGroup.defaultGroup().models();

		for (int i = 0; i < models.count(); i++) {
			EOModel model = (EOModel) models.objectAtIndex(i);

			log.debug("Dictionary " + model.name() + ": " + model.connectionDictionary());
		}

		inicializarControllers();
	}

	public void didFinishLaunching() {
		log.debug("didFinishLaunching called.");

		log.info("ERExtensions version: " + ERXProperties.versionStringForFrameworkNamed("ERExtensions"));
		log.info("Versão: " + versaoAplicacao());
		ERXLocalizer.setLocalizerForLanguage(new MOLLocalizer("Portuguese"), "Portuguese");

		ERCoreBL.sharedInstance().addPreferenceRelationshipToActorEntity(Usuario.ENTITY_NAME);
		log.debug(ERCoreBL.sharedInstance());

		// Setup main navigation
		ERXNavigationManager.manager().configureNavigation();

	}

	/**
	 * Determines the WOSession class to instantiate.
	 * @see com.webobjects.appserver.WOApplication#_sessionClass()
	 */
	@Override
	protected Class< ? extends WOSession > _sessionClass() {
		return Session.class;
	}

	/**
	 * Install patches including ensuring that Main is correctly resolved at runtime.
	 * @see er.extensions.appserver.ERXApplication#installPatches()
	 */
	@Override
	public void installPatches() {
		super.installPatches();
		ERXPatcher.setClassForName(Main.class, "Main");
	}


	public  String versaoAplicacao() {
		if (versao == null)
			versao = ERXProperties.stringForKey("VersaoAplicacao");
		return versao;
	}

	public WOResponse handleException(Exception exception, WOContext context) {
		WOResponse response = super.handleException(exception, context);

		// Verifica se é para mostrar a página de erro personalizada
		if (BooleanUtils.toBoolean(System.getProperty("paginaErro.ativo"))) {
			String from = System.getProperty("paginaErro.mailFrom");
			String to = System.getProperty("paginaErro.mailTo");
			String assunto = System.getProperty("paginaErro.assunto");
			String errorDescription = ExceptionUtils.getFullStackTrace(exception);

			/*
			 * WOMailDelivery mailDelivery = WOMailDelivery.sharedInstance();
			 *
			 * mailDelivery.composePlainTextEmail(from, new
			 * NSArray(to.split(",")), null, assunto, errorDescription, true);
			 */
			if (context.hasSession()) {
				context.session().terminate();
			}

			//ErroInesperadoPage errorPage = (ErroInesperadoPage) pageWithName(ErroInesperadoPage.class.getName(), context);

			//errorPage.setExcecao(exception);

			//response = errorPage.generateResponse();
		}

		return response;
	}
}
