package net.formiguinhas.autenticacao;

import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.foundation.ERXProperties;

public class AutenticacaoFactory {

	public static IAutenticacao getInstance(EOEditingContext eoEditingContext) {
		Class var = null;
		try {
			var = Class.forName(ERXProperties.stringForKeyWithDefault("autenticacao.class", ""));
			return (IAutenticacao) var.cast(IAutenticacao.class);
		} catch (ClassNotFoundException e) {
			return new AutenticacaoSimples(eoEditingContext);
		}
	}
}
