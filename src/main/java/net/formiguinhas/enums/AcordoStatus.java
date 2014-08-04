package net.formiguinhas.enums;

public enum AcordoStatus {

	PROPOSTO("Proposto"), ACEITO("Aceito"),RECUSADO("Recusado") ;

	private String descricao;

	private AcordoStatus(String descricao) {
		this.descricao = descricao;
	}

	public String descricao() {
		return descricao();
	}

}
