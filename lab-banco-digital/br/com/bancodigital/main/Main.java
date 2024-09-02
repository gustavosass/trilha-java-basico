package br.com.bancodigital.main;
import java.util.ArrayList;
import java.util.List;

import br.com.bancodigital.banco.Banco;
import br.com.bancodigital.cartao.CartaoCredito;
import br.com.bancodigital.cliente.Cliente;
import br.com.bancodigital.conta.Conta;
import br.com.bancodigital.conta.ContaCorrente;
import br.com.bancodigital.conta.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		
		Banco banco = new Banco();
	
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Conta cc = new ContaCorrente(venilton, banco);
		Conta poupanca = new ContaPoupanca(venilton, banco);
		contas.add(cc);
		contas.add(poupanca);
		banco.setContas(contas);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
				
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		if (cc instanceof ContaCorrente) {
	        ContaCorrente contaCorrente = (ContaCorrente) cc;
	        CartaoCredito cartao = ((ContaCorrente) cc).getCartaoCredito());
		}
		
		System.out.println(cartao.);
		
		
		banco.listarClientes();
			
	}

}
