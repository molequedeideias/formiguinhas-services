package net.formiguinhas.enums;

public enum ProdutoUnidade {

	Kilo("Quilo"), LITRO("Litro"),POR_UNIDADE("Por unidade");

	private String descricao;

	private ProdutoUnidade(String descricao) {
		this.descricao = descricao;
	}

	public String descricao() {
		return descricao();
	}
}
