package br.edu.unoesc.test;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;

import br.edu.unoesc.carrinho.Produto;
import br.edu.unoesc.carrinho.TipoProduto;


public class ProdutoTest {
	
	private Produto produto;
	
	@Before
	public void before(){
		produto = new Produto();
		produto.setPreco(100.0);
		produto.setDescricao("Descrição do produto");
	}
	
	@Test
	public void deveDarCincoPorcentoDeDesconto() {
		produto.setTipo(TipoProduto.BEBIDA);
		assertThat(produto.getPrecoComDesconto(), is(95.0));
	}
	
	@Test
	public void deveDarVinteECincoPorcentoDeDesconto() {
		produto.setTipo(TipoProduto.VESTUARIO);
		assertThat(produto.getPrecoComDesconto(), is(75.0));
	}

}
