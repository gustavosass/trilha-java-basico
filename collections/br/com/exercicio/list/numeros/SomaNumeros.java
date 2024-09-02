package br.com.exercicio.list.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros{
	List<Integer> lista;
	
	public SomaNumeros() {
		this.lista = new ArrayList<Integer>();
	}
	
	public void adicionarNumero(int numero) {
		this.lista.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer item : this.lista) {
			soma += item;
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorValor = 0;
		for(Integer item : this.lista) {
			if (item > maiorValor) {
				maiorValor = item;
			}
		}
		return maiorValor;
	}
	
	public int encontrarMenorNumero() {
		int menorValor = this.lista.get(0);
		for(Integer item : this.lista) {
			if (item <= menorValor) {
				menorValor = item;
			}
		}
		return menorValor;
	} 
	
	public void exibirNumeros() {
		for(Integer item : this.lista) {
			System.out.println(item);
		}
	}
	
	public List<Integer> ordenarAscendente() {
		Collections.sort(this.lista);
		return this.lista;
	}
	
	public List<Integer> ordenarDescendente() {
		Collections.sort(this.lista, Collections.reverseOrder());
		return this.lista;
	}

	
}