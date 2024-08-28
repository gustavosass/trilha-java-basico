import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 14, 10, 15);

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 14, 10, 15);
		
		//Desafio 1 - Mostre a lista na ordem numérica:
		System.out.println("Mostre a lista na ordem numérica");
		numeros.stream().sorted().forEach(System.out::println);
		
		//Desafio 2 - Imprima a soma dos números pares da lista:
		System.out.println("Imprima a soma dos números pares da lista");
		System.out.println(numeros.stream().filter(n -> n % 2 == 0).reduce(0, (n1, n2) -> n1 + n2));
		
		//Desafio 3 - Verifique se todos os números da lista são positivos:
		System.out.println("Verifique se todos os números da lista são positivos");
		System.out.println(numeros.stream().allMatch(n -> n > 0));
		
		//Desafio 4 - Remova todos os valores ímpares
		System.out.println("Remova todos os valores ímpares");
		numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
		
		//Desafio 5 - Calcule a média dos números maiores que 5:
		System.out.println("Calcule a média dos números maiores que 5");
		try{
			System.out.println(numeros.stream().filter(n -> n > 5).mapToInt(n -> n).average().getAsDouble());
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Desafio 6 - Verificar se a lista contém algum número maior que 10:
		System.out.println("Verificar se a lista contém algum número maior que 10");
		System.out.println(numeros.stream().anyMatch(n -> n > 10));
		
		//Desafio 7 - Encontrar o segundo número maior da lista
		System.out.println("Encontrar o segundo número maior da lista");
		System.out.println(numeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1));
		
		//Desafio 8 - Somar os dígitos de todos os números da lista:
		System.out.println("Somar os dígitos de todos os números da lista");
		System.out.println(numeros.stream().reduce(0, Integer::sum));
		
		//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
		System.out.println("Verificar se todos os números da lista são distintos (não se repetem)");
		if(numeros.stream().distinct().count() != numeros.size()) {
			System.out.println("Se repetem");
		}else {
			System.out.println("Não se repetem");
		}
		
		//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
		System.out.println("Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5");
		numeros.stream().filter(n -> (n % 3 == 0 || n % 5 == 0) && n % 2 != 0).forEach(System.out::println);
		
		//Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
		System.out.println("Encontre a soma dos quadrados de todos os números da lista");
		System.out.println(numeros.stream().map(n -> n * n).reduce(0, (n1, n2) -> n1 + n2));
		
		//Desafio 12 - Encontre o produto de todos os números da lista:
		System.out.println("Encontre o produto de todos os números da lista");
		System.out.println(numeros.stream().mapToLong(n -> n).reduce(1, (n1, n2) -> n1 * n2));
		
		//Desafio 13 - Filtrar os números que estão dentro de um intervalo:
		System.out.println("Filtrar os números que estão dentro de um intervalo");
		numeros.stream().filter(n -> n > 5 && n < 10).forEach(n -> System.out.println(n));
		
		//Desafio 14 - Encontre o maior número primo da lista
		System.out.println("Desafio 14 - Encontre o maior número primo da lista");
		System.out.println(numeros.stream().filter(n -> (n % 2 != 0 || n == 2) && n > 0).mapToInt(n -> n).max().getAsInt());

		//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
		System.out.println("Desafio 15 - Verifique se a lista contém pelo menos um número negativo");
		numeros.stream().filter(n -> n < 0).forEach(System.out::println);
		
		//Desafio 16 - Agrupe os números em pares e ímpares:
		System.out.println("Desafio 16 - Agrupe os números em pares e ímpares");
		System.out.println("Pares");
		List<Integer> pares = numeros.stream().filter(n-> n % 2 == 0).collect(Collectors.toList());
		pares.stream().forEach(System.out::println);
		System.out.println("Impares");
		List<Integer> impares = numeros.stream().filter(n-> n % 2 != 0).collect(Collectors.toList());
		impares.stream().forEach(System.out::println);
		
		//Desafio 17 - Filtrar os números primos da lista:
		System.out.println("Filtrar os números primos da lista");
		numeros.stream().filter(n -> (n % 2 != 0 || n == 2) && n > 0).forEach(System.out::println);
		
		//Desafio 18 - Verifique se todos os números da lista são iguais:
		System.out.println("Verifique se todos os números da lista são iguais");
		if (numeros.stream().distinct().count() == 1) {
			System.out.println("Todos os elementos são iguais");
		}else {
			System.out.println("Elementos são diferentes");
		}
		
		//Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
		System.out.println("Encontre a soma dos números divisíveis por 3 e 5");
		System.out.println(numeros.stream().filter(n -> (n % 3 == 0 && n % 5 == 0)).reduce(0, (n1, n2) -> n1 + n2));
	}
}