package br.edu.unoesc.carrinho;

public enum TipoProduto {

	BEBIDA(new CincoPorcento()), 
	VESTUARIO(new VinteECincoPorcento());

	TipoProduto(CalculaDescontoProduto calculadora) {
		this.calculadora = calculadora;
	}

	private CalculaDescontoProduto calculadora;

	public CalculaDescontoProduto getCalculadora() {
		return calculadora;
	}
}