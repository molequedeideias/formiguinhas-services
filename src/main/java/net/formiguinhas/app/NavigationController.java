package net.formiguinhas.app;

import net.formiguinhas.negocios.Fornecedor;
import net.formiguinhas.negocios.ListaDeCompras;
import net.formiguinhas.negocios.Produto;
import net.formiguinhas.negocios.Usuario;


import com.webobjects.appserver.WOComponent;
import com.webobjects.directtoweb.D2W;
import com.webobjects.directtoweb.EditPageInterface;
import com.webobjects.directtoweb.ErrorPageInterface;
import com.webobjects.directtoweb.QueryPageInterface;

import er.directtoweb.ERD2WFactory;

public class NavigationController {

	public interface Keys {
		public static final String anonimoNavigationMenuKey = "Anonimo";
		public static final String semProfileNavigationMenuKey = "Sem_Profile";
		public static final String administradorNavigationMenuKey = "Administrador";

	}

	public static final String RESOURCE = "Resource";

	private Session _session;

	private String subMenu = "home";

	public NavigationController(Session s) {
		super();
		_session = s;
	}

	public String loadMenuByPerfil() {

		return Keys.administradorNavigationMenuKey;

//		if (session().usuario() != null)
//			if  (session().usuario().profile() != null)
//				return session().usuario().profile().name();
//			else
//				return Keys.semProfileNavigationMenuKey;
//		else
//			return Keys.anonimoNavigationMenuKey;
	}

	// GENERIC ACTIONS

	public WOComponent queryPageForEntityName(String entityName) {
		QueryPageInterface newQueryPage = D2W.factory().queryPageForEntityNamed(entityName, session());
		return (WOComponent) newQueryPage;
	}

	public WOComponent newObjectForEntityName(String entityName) {
		WOComponent nextPage = null;
		try {
			EditPageInterface epi = D2W.factory().editPageForNewObjectWithEntityNamed(entityName, session());
			epi.setNextPage(session().context().page());
			nextPage = (WOComponent) epi;
		} catch (IllegalArgumentException e) {
			ErrorPageInterface epf = D2W.factory().errorPage(session());
			epf.setMessage(e.toString());
			epf.setNextPage(session().context().page());
			nextPage = (WOComponent) epf;
		}
		return nextPage;
	}

	// ACCESSORS

	public Session session() {
		return _session;
	}

	public void setSession(Session s) {
		_session = s;
	}

	public String getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(String subMenu) {
		this.subMenu = subMenu;
	}

	// NAV ACTIONS

	public WOComponent homeAction() {
		subMenu = "home";
		return D2W.factory().defaultPage(session());
	}

	public WOComponent gestaoFornecedorAction() {
		subMenu = "Gestao_Fornecedor";
		return D2W.factory().defaultPage(session());
	}

	public WOComponent gestaoListaDeComprasAction() {
		subMenu = "Gestao_ListaDeCompras";
		return D2W.factory().defaultPage(session());
	}

	public WOComponent gestaoUsuarioAction() {
		subMenu = "Gestao_Usuario";
		return D2W.factory().defaultPage(session());
	}

	public WOComponent gestaoProdutoAction() {
		subMenu = "Gestao_Produto";
		return D2W.factory().defaultPage(session());
	}

	// Fornecedor
	public WOComponent queryFornecedorAction() {
		return queryPageForEntityName(Fornecedor.ENTITY_NAME);
	}

	public WOComponent createFornecedorAction() {
		return newObjectForEntityName(Fornecedor.ENTITY_NAME);
	}

	// Usuario
	public WOComponent queryUsuarioAction() {
		return queryPageForEntityName(Usuario.ENTITY_NAME);
	}

	public WOComponent createUsuarioAction() {
		return newObjectForEntityName(Usuario.ENTITY_NAME);
	}

	// Lista de Compras
	public WOComponent queryListaDeComprasAction() {
		return queryPageForEntityName(ListaDeCompras.ENTITY_NAME);
	}

	public WOComponent createListaDeComprasAction() {
		return newObjectForEntityName(ListaDeCompras.ENTITY_NAME);
	}

	// Produto
	public WOComponent queryProdutoAction() {
		return queryPageForEntityName(Produto.ENTITY_NAME);
	}

	public WOComponent createProdutoAction() {
		return newObjectForEntityName(Produto.ENTITY_NAME);
	}

	// Minha Conta
	public WOComponent minhaContaAction() {
		EditPageInterface minhaContaPage = D2W.factory().editPageForEntityNamed(Usuario.ENTITY_NAME, session());
		minhaContaPage.setObject(session().usuario());
		return (WOComponent) minhaContaPage;
	}



}
