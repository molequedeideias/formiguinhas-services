package net.formiguinhas.enums;

public enum DadosBancariosBanco {

	BB("Banco do Brasil"), Bradesco("Bradesco"),Itau("Itaú"),Santander("Santander") ;

	private String descricao;

	private DadosBancariosBanco(String descricao) {
		this.descricao = descricao;
	}

	public String descricao() {
		return descricao();
	}

}
