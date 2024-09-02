package br.com.desafiopoo.dispositivo;

import java.util.Scanner;

import br.com.desafiopoo.dispositivo.musica.ReprodutorMusical;
import br.com.desafiopoo.dispositivo.navegador.NavegadorInternet;
import br.com.desafiopoo.dispositivo.telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void ligar(String numeroTelefone) {
		System.out.println("Ligando para " + numeroTelefone + "\n");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação!");	
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz!");
	}

	@Override
	public void menuNavegadorInternet() {
		Scanner sc = new Scanner(System.in);
		int opcaoMenu;
		
		do {
			System.out.println("\nNavegador - menu\n"
					+ "----------------------\n"
					+ "1 - Adicionar aba\n"
					+ "2 - Remover aba\n"
					+ "3 - Atualizar pagina\n"
					+ "4 - Sair\n");
			
			try {
				System.out.println("Digite a opção: ");
				opcaoMenu = sc.nextInt();
			}catch(Exception e){
				System.out.println("Digite um número.");
				opcaoMenu = 0;
			}
			
			switch(opcaoMenu) {
				case 1:
					adicionarAba();
					System.out.println("Digite a url:");
					String url = sc.next();
					exibirPagina(url);
					atualizarPagina();
					break;
				case 2:
					removerAba();
					break;
				case 3:
					atualizarPagina();
					break;
				case 4:
					System.out.println("Voltando ao menu principal.");
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}while(opcaoMenu != 4);
	}

	@Override
	public void removerAba() {
		System.out.println("Aba removida.");		
	}

	@Override
	public void adicionarAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Abrindo página: " + url);
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada.");
	}
	

	@Override
	public void menuReprodutorMusical() {
		Scanner sc = new Scanner(System.in);
		int opcaoMenu;
		
		do {
			System.out.println("\nReprodutor de musica - menu\n"
					+ "----------------------\n"
					+ "1 - Selecionar musica\n"
					+ "2 - Tocar\n"
					+ "3 - Pausar\n"
					+ "4 - Sair\n");
			
			try {
				System.out.println("Digite a opção: ");
				opcaoMenu = sc.nextInt();
			}catch(Exception e){
				System.out.println("Digite um número.");
				opcaoMenu = 0;
			}
			
			switch(opcaoMenu) {
				case 1:
					selecionarMusica();
					break;
				case 2:
					tocar();
					break;
				case 3:
					pausar();
					break;
				case 4:
					System.out.println("Voltando ao menu principal.");
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}while(opcaoMenu != 4);
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica.");
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar musica.");	
	}
}
