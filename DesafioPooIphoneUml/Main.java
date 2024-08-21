import java.util.Scanner;

import br.com.desafiopoo.dispositivo.Iphone;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Iphone dispositivo = new Iphone();
		int opcaoMenu;
		do {
			System.out.println("----------------------\n"
					+ "Iphone menu\n"
					+ "----------------------\n"
					+ "1 - Fazer uma ligação\n"
					+ "2 - Atender\n"
					+ "3 - Ouvir correio de voz\n"
					+ "4 - Navegador web\n"
					+ "5 - Reprodutor musical\n"
					+ "6 - Sair\n");
			
			try {
				System.out.println("Digite a opção: ");
				opcaoMenu = sc.nextInt();
				System.out.println("--------------");
			}catch(Exception e){
				System.out.println("Digite um número.");
				opcaoMenu = 0;
			}
			
			switch(opcaoMenu) {
				case 1:
					System.out.println("Digite o telefone:");
					String numeroTelefone = sc.next();
					System.out.println("--------------");
					dispositivo.ligar(numeroTelefone);
					break;
				case 2:
					dispositivo.atender();
					break;
				case 3:
					dispositivo.iniciarCorreioVoz();
					break;
				case 4:
					dispositivo.menuNavegadorInternet();
					break;
				case 5:
					dispositivo.menuReprodutorMusical();
					break;
				case 6:
					System.out.println("Sistema encerrado.");
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
			
		}while(opcaoMenu != 6);
		sc.close();

	}

}
