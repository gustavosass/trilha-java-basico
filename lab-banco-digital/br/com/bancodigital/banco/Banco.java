package br.com.bancodigital.banco;
import java.util.List;

import br.com.bancodigital.conta.Conta;


public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void listarClientes() {
		System.out.println("=== Lista de clientes ===");
		contas.stream().forEach(n -> System.out.println(n.getCliente().getNome()));
	}

}
