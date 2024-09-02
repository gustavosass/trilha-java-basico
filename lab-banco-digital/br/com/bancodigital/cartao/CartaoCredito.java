package br.com.bancodigital.cartao;

import java.time.LocalDate;
import java.util.Random;

public class CartaoCredito {
	
	private static long NUMERO_CARTAO = 0000000000000001;
	
	private String nome;
	private long numero;
	private int codigoSecreto;
	private LocalDate dataVencimento;
	
	public CartaoCredito(String nome) {
		this.nome = nome;
		this.numero = NUMERO_CARTAO++;
		this.codigoSecreto = gerarCodigoSecreto();
		this.dataVencimento = LocalDate.now().plusYears(3);
	}
	
	private int gerarCodigoSecreto() {
		Random codigo = new Random();
		return codigo.nextInt(999);
	}

	public String getNome() {
		return nome;
	}

	public long getNumero() {
		return numero;
	}

	public int getCodigoSecreto() {
		return codigoSecreto;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	
}
