package br.com.bancodigital.conta;

import br.com.bancodigital.banco.Banco;
import br.com.bancodigital.cartao.CartaoCredito;
import br.com.bancodigital.cliente.Cliente;

public class ContaCorrente extends Conta {
	
	private CartaoCredito cartaoCredito;
	
	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
		this.cartaoCredito = new CartaoCredito(cliente.getNome());
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}

}
