package net.formiguinhas.enums;

public enum FoneTipo {

	Celular("Celular"), Residencial("Residencial"),Comercial("Comercial"),Fax("Fax");

	private String descricao;

	private FoneTipo(String descricao) {
		this.descricao = descricao;
	}

	public String descricao() {
		return descricao();
	}

}
