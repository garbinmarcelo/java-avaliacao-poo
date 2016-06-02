package br.edu.unoesc.test;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.List;

import br.edu.unoesc.carrinho.Carrinho;
import br.edu.unoesc.carrinho.ItemCarrinho;
import br.edu.unoesc.carrinho.Produto;
import br.edu.unoesc.carrinho.TipoProduto;

public class CarrinhoTest {

	private Produto cerveja;
	private Produto vestido;
	private Produto camisa;
	private ItemCarrinho item1;
	private ItemCarrinho item2;
	private ItemCarrinho item3;
	
	@Before
	public void before(){
		cerveja = new Produto();
		cerveja.setPreco(10.0);
		cerveja.setDescricao("Cerveja");
		cerveja.setTipo(TipoProduto.BEBIDA);
		
		vestido = new Produto();
		vestido.setPreco(100.0);
		vestido.setDescricao("Vestido");
		vestido.setTipo(TipoProduto.VESTUARIO);
		
		camisa = new Produto();
		camisa.setPreco(80.0);
		camisa.setDescricao("Camisa");
		camisa.setTipo(TipoProduto.VESTUARIO);
		
		item1 = new ItemCarrinho();
		item1.setProduto(cerveja);
		item1.setQuantidade(10);
		
		item2 = new ItemCarrinho();
		item2.setProduto(vestido);
		item2.setQuantidade(2);
		
		item3 = new ItemCarrinho();
		item3.setProduto(camisa);
		item3.setQuantidade(3);
	}
	
	@Test
	public void testDeveAdicionarProduto() {
		Carrinho carrinho = new Carrinho();
		carrinho.add(item1);
		carrinho.add(item2);
		assertThat(carrinho.getItens().size(), is(2));
	}

	@Test
	public void testTotalCarrinho() {
		Carrinho carrinho = new Carrinho();
		carrinho.add(item1);
		carrinho.add(item2);
		assertThat(carrinho.total(), is(300.0));
	}
	
	@Test
	public void testTotalComDescontoCarrinho() {
		Carrinho carrinho = new Carrinho();
		carrinho.add(item1);
		carrinho.add(item2);
		assertThat(carrinho.totalComDesconto(), is(245.0));
	}
	
	@Test
	public void deveOrdenarDecrescente() {
		Carrinho carrinho = new Carrinho();
		carrinho.add(item1);
		carrinho.add(item2);
		carrinho.add(item3);

		List<ItemCarrinho> listaItensDecrescente = carrinho.ordenarItensDecrescente(carrinho.getItens());

		Produto produto = listaItensDecrescente.get(0).getProduto();
		assertThat(produto.getDescricao(), is("Vestido"));
	}
	
	@Test
	public void deveOrdenarCrescente() {
		Carrinho carrinho = new Carrinho();
		carrinho.add(item1);
		carrinho.add(item2);
		carrinho.add(item3);

		List<ItemCarrinho> listaItensCrescente = carrinho.ordenarItensCrescente(carrinho.getItens());

		Produto produto = listaItensCrescente.get(0).getProduto();
		assertThat(produto.getDescricao(), is("Cerveja"));
	}
	
}
