package net.formiguinhas.autenticacao;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;

import net.formiguinhas.negocios.Usuario;

public class AutenticacaoSimples implements IAutenticacao {

	private EOEditingContext editingContext;

	public AutenticacaoSimples(EOEditingContext eoe) {
		editingContext = eoe;
	}

	@Override
	public Usuario autenticarUsuario(String username, String password) {
		NSArray<Usuario> usuarios = Usuario.fetchLoginSenha(editingContext, username, password);
		if (usuarios.count() ==1 )
			return usuarios.lastObject();
		else
			return null;
	}

	@Override
	public String recuperarSenha(String emailUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
