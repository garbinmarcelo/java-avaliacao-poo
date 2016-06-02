package br.edu.unoesc.carrinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Carrinho {
	
	private List<ItemCarrinho> itens;
	
	public Carrinho() {
		itens = new ArrayList<>();
	}
	
	public void add(ItemCarrinho item){
		itens.add(item);
	}
	
	public Double total() {
		
		Double saldoTotal = 0.0;
		for(ItemCarrinho item: itens){
			saldoTotal += (item.getProduto().getPreco()  * item.getQuantidade());
		}
		return saldoTotal;

	}
	
	public Double totalComDesconto() {
		
		Double saldoTotal = 0.0;
		for(ItemCarrinho item: itens){
			saldoTotal += (item.getProduto().getPrecoComDesconto() * item.getQuantidade());
		}
		return saldoTotal;

	}
	
	
	public List<ItemCarrinho> ordenarItensCrescente(List<ItemCarrinho> itens) {
		Collections.sort(itens, new Comparator<ItemCarrinho>() {
			public int compare(ItemCarrinho item1, ItemCarrinho item2) {
				Double preco1 = item1.getProduto().getPreco();
				Double preco2 = item2.getProduto().getPreco();

				return preco1.compareTo(preco2);
			}
		});

		return itens;
	}


	public List<ItemCarrinho> ordenarItensDecrescente(List<ItemCarrinho> itens) {
		Collections.sort(itens, new Comparator<ItemCarrinho>() {
			public int compare(ItemCarrinho item1, ItemCarrinho item2) {
				Double preco1 = item1.getProduto().getPreco();
				Double preco2 = item2.getProduto().getPreco();

				return preco2.compareTo(preco1);
			}
		});

		return itens;
	}

	public List<ItemCarrinho> getItens() {
		return itens;
	}

}
