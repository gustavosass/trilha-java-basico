package br.com.exercicio.list.tarefa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa> lista;
	
	public ListaTarefas() {
		 this.lista = new ArrayList<Tarefa>();
	}
	
	public void adicionarTarefa(String descricao) {
		Tarefa tarefa = new Tarefa(descricao);
		this.lista.add(tarefa);
	}
	
	public void removerTarefa(String descricao) {
		for (Iterator<Tarefa> iterator = this.lista.iterator(); iterator.hasNext(); ) {
		    if (iterator.next().getDescricao().equals(descricao)) {
		        iterator.remove();
		    }
		}
	}
	
	public int obterNumeroTotalTarefas() {
		return (int) this.lista.stream().count();
	}
	
	public List<String> obterDescricoesTarefas() {
		List<String> newList = new ArrayList<String>();
		this.lista.forEach((n) -> {newList.add(n.getDescricao());});
		return newList;
	}
}
