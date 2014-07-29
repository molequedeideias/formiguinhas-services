package net.formiguinhas.autenticacao;

import net.formiguinhas.negocios.Usuario;
	/*
	 * Interface de trata todas autenticações feitas pelo sistema
	 */
	public interface IAutenticacao {

		Usuario autenticarUsuario(String username, String password);

		String recuperarSenha(String emailUsuario);

}
