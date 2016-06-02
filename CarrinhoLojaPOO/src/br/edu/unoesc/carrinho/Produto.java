package br.edu.unoesc.carrinho;

public class Produto {
	
	public Produto() {
		
	}
	
	private Double preco;
	private TipoProduto tipo;
	private String descricao;
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPrecoComDesconto() {
		return this.tipo.getCalculadora().calcDescontoProduto(this);
	}
	
}