import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int parametroUm, parametroDois;
		
		System.out.println("Parametro 1: ");
		parametroUm = sc.nextInt();
		System.out.println("Parametro 2: ");
		parametroDois = sc.nextInt();
		
		try {
			Contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosException e){
			System.out.println("O segundo par�metro deve ser maior que o primeiro.");
		}
		sc.close();
	}
	
	static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		int diferencaParametro = parametroDois - parametroUm;
		for(int i=1; i <= diferencaParametro; i++) {
			System.out.println("Imprimindo n�mero: "+ i);
		}
	}

}
