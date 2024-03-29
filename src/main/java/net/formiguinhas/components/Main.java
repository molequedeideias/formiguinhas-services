// Generated by the Maven Archetype Plug-in
package net.formiguinhas.components;

import org.apache.log4j.Logger;

import net.formiguinhas.app.Session;
import net.formiguinhas.autenticacao.AutenticacaoFactory;
import net.formiguinhas.autenticacao.IAutenticacao;
import net.formiguinhas.negocios.Usuario;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSPropertyListSerialization;
import com.webobjects.foundation.NSValidation.ValidationException;
import com.webobjects.directtoweb.D2W;

import er.extensions.foundation.ERXProperties;

public class  Main extends WOComponent {

	private static final Logger log = Logger.getLogger(Main.class);

	private static final long serialVersionUID = 1L;
    public String username;
    public String password;
    public boolean wantsWebAssistant = false;
	public String mensagemValidacao;
	public IAutenticacao autenticacao;

    public Main(WOContext aContext) {
        super(aContext);
        autenticacao = AutenticacaoFactory.getInstance(session().defaultEditingContext());
    }

	private boolean validarSenha(String password) {
		if (null == password || password.isEmpty())
			return false;
		else
			return true;
	}

	private boolean validarUsuario(String username) {
		if (null == username || username.isEmpty())
			return false;
		else
			return true;
	}

	public WOComponent defaultPage() {
		 if (logar()) {
			return D2W.factory().defaultPage(session());
		}
		return context().page();

	}

	private boolean logar() {
		mensagemValidacao = "";
			if ((validarUsuario(username)) && (validarSenha(password))) {
				Usuario usuario = autenticacao.autenticarUsuario(username, password);
				if (null != usuario){
					((Session)session()).setUsuario(usuario);
					return true;
				}

			}
		mensagemValidacao = "Login inválido";
		return false;

	}

	public String tituloSistemaLogin() {

		return ERXProperties.stringForKey("Login_TituloSistema");

	}

	public WOComponent recuperarSenhaPage(){
		return this;
		//return pageWithName(EnvioRecuperarSenhaPage.class.getName());
	}

	public boolean isAssistantCheckboxVisible() {
		return ERXProperties.booleanForKeyWithDefault(
				"D@WWebAssistant Enabled", false);
	}

}
