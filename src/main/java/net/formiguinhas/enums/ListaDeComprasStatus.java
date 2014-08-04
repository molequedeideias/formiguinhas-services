package net.formiguinhas.enums;

public enum ListaDeComprasStatus {

	ATIVA("Ativa"), CANCELADA("Cancelada"),FECHADA("Fechada");;

	private String descricao;

	private ListaDeComprasStatus(String descricao) {
		this.descricao = descricao;
	}

	public String descricao() {
		return descricao();
	}

}
