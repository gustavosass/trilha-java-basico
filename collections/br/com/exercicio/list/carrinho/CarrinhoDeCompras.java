package br.com.exercicio.list.carrinho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.exercicio.list.tarefa.Tarefa;

public class CarrinhoDeCompras {
	
	
	private List<Item> lista;
	
	public CarrinhoDeCompras() {
		this.lista = new ArrayList<Item>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		lista.add(item);
	}
	
	public void removerItem(String nome) {
		for (Iterator<Item> iterator = this.lista.iterator(); iterator.hasNext(); ) {
		    if (iterator.next().getNome().equals(nome)) {
		        iterator.remove();
		    }
		}
	}
	
	public float calcularValorTotal() {
		float soma = 0;
		for (Item item : lista) {
			soma += item.getPreco(); 
		}
		return soma;
	}
	
	public void exibirItens() {
		lista.forEach((n) -> {System.out.println("Nome: " + n.getNome() 
												+ " Preço: " + n.getPreco()
												+ " Quantidade: " + n.getQuantidade());});
	}
		
}
