package br.edu.unoesc.carrinho;

public class VinteECincoPorcento implements CalculaDescontoProduto {

	@Override
	public double calcDescontoProduto(Produto produto) {
		return produto.getPreco() * 0.75;
	}

}
