import java.util.Scanner;

public class ContaTerminal {

	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia!");
		conta.setAgencia(sc.nextLine());
		System.out.println("Por favor, digite o n�mero da conta!");
		conta.setConta(sc.nextInt());
		sc.nextLine();
		System.out.println("Por favor, digite o nome do cliente!");
		cliente.setNome(sc.nextLine());
		System.out.println("Por favor, digite o saldo!");
		conta.setSaldo(sc.nextFloat());
		conta.setCliente(cliente);

		System.out.println("Ol�, "
				.concat(conta.getCliente().getNome())
				.concat(", obrigado por criar uma conta em nosso banco, sua ag�ncia � ")
				.concat(conta.getAgencia())
				.concat(", conta ")
				.concat(String.valueOf(conta.getConta()))
				.concat(" e seu saldo R$ ")
				.concat(String.valueOf(conta.getSaldo()))
				.concat(" j� esta dispon�vel para saque."));
	}

}
