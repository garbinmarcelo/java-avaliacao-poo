package br.edu.unoesc.carrinho;

public class CincoPorcento implements CalculaDescontoProduto {

	@Override
	public double calcDescontoProduto(Produto produto) {
		return produto.getPreco() * 0.95;
	}

}
