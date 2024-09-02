package br.com.bancodigital.main;
import java.util.ArrayList;
import java.util.List;

import br.com.bancodigital.banco.Banco;
import br.com.bancodigital.cliente.Cliente;
import br.com.bancodigital.conta.Conta;
import br.com.bancodigital.conta.ContaCorrente;
import br.com.bancodigital.conta.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		
		Banco banco = new Banco();
	
		Cliente cliente = new Cliente();
		cliente.setNome("Gustavo");
		ContaCorrente cc = new ContaCorrente(cliente, banco);
		ContaPoupanca poupanca = new ContaPoupanca(cliente, banco);
		contas.add(cc);
		contas.add(poupanca);
		banco.setContas(contas);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
				
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.listarClientes();

	}

}
