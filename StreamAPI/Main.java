import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 14, 10, 15);

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 14, 10, 15);
		
		//Desafio 1 - Mostre a lista na ordem num�rica:
		System.out.println("Mostre a lista na ordem num�rica");
		numeros.stream().sorted().forEach(System.out::println);
		
		//Desafio 2 - Imprima a soma dos n�meros pares da lista:
		System.out.println("Imprima a soma dos n�meros pares da lista");
		System.out.println(numeros.stream().filter(n -> n % 2 == 0).reduce(0, (n1, n2) -> n1 + n2));
		
		//Desafio 3 - Verifique se todos os n�meros da lista s�o positivos:
		System.out.println("Verifique se todos os n�meros da lista s�o positivos");
		System.out.println(numeros.stream().allMatch(n -> n > 0));
		
		//Desafio 4 - Remova todos os valores �mpares
		System.out.println("Remova todos os valores �mpares");
		numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
		
		//Desafio 5 - Calcule a m�dia dos n�meros maiores que 5:
		System.out.println("Calcule a m�dia dos n�meros maiores que 5");
		try{
			System.out.println(numeros.stream().filter(n -> n > 5).mapToInt(n -> n).average().getAsDouble());
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Desafio 6 - Verificar se a lista cont�m algum n�mero maior que 10:
		System.out.println("Verificar se a lista cont�m algum n�mero maior que 10");
		System.out.println(numeros.stream().anyMatch(n -> n > 10));
		
		//Desafio 7 - Encontrar o segundo n�mero maior da lista
		System.out.println("Encontrar o segundo n�mero maior da lista");
		System.out.println(numeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1));
		
		//Desafio 8 - Somar os d�gitos de todos os n�meros da lista:
		System.out.println("Somar os d�gitos de todos os n�meros da lista");
		System.out.println(numeros.stream().reduce(0, Integer::sum));
		
		//Desafio 9 - Verificar se todos os n�meros da lista s�o distintos (n�o se repetem):
		System.out.println("Verificar se todos os n�meros da lista s�o distintos (n�o se repetem)");
		if(numeros.stream().distinct().count() != numeros.size()) {
			System.out.println("Se repetem");
		}else {
			System.out.println("N�o se repetem");
		}
		
		//Desafio 10 - Agrupe os valores �mpares m�ltiplos de 3 ou de 5:
		System.out.println("Desafio 10 - Agrupe os valores �mpares m�ltiplos de 3 ou de 5");
		numeros.stream().filter(n -> (n % 3 == 0 || n % 5 == 0) && n % 2 != 0).forEach(System.out::println);
		
		//Desafio 11 - Encontre a soma dos quadrados de todos os n�meros da lista:
		System.out.println("Encontre a soma dos quadrados de todos os n�meros da lista");
		System.out.println(numeros.stream().map(n -> n * n).reduce(0, (n1, n2) -> n1 + n2));
		
		//Desafio 12 - Encontre o produto de todos os n�meros da lista:
		System.out.println("Encontre o produto de todos os n�meros da lista");
		System.out.println(numeros.stream().mapToLong(n -> n).reduce(1, (n1, n2) -> n1 * n2));
		
		//Desafio 13 - Filtrar os n�meros que est�o dentro de um intervalo:
		System.out.println("Filtrar os n�meros que est�o dentro de um intervalo");
		numeros.stream().filter(n -> n > 5 && n < 10).forEach(n -> System.out.println(n));
		
		//Desafio 14 - Encontre o maior n�mero primo da lista
		System.out.println("Desafio 14 - Encontre o maior n�mero primo da lista");
		System.out.println(numeros.stream().filter(n -> (n % 2 != 0 || n == 2) && n > 0).mapToInt(n -> n).max().getAsInt());

		//Desafio 15 - Verifique se a lista cont�m pelo menos um n�mero negativo:
		System.out.println("Desafio 15 - Verifique se a lista cont�m pelo menos um n�mero negativo");
		numeros.stream().filter(n -> n < 0).forEach(System.out::println);
		
		//Desafio 16 - Agrupe os n�meros em pares e �mpares:
		System.out.println("Desafio 16 - Agrupe os n�meros em pares e �mpares");
		System.out.println("Pares");
		List<Integer> pares = numeros.stream().filter(n-> n % 2 == 0).collect(Collectors.toList());
		pares.stream().forEach(System.out::println);
		System.out.println("Impares");
		List<Integer> impares = numeros.stream().filter(n-> n % 2 != 0).collect(Collectors.toList());
		impares.stream().forEach(System.out::println);
		
		//Desafio 17 - Filtrar os n�meros primos da lista:
		System.out.println("Filtrar os n�meros primos da lista");
		numeros.stream().filter(n -> (n % 2 != 0 || n == 2) && n > 0).forEach(System.out::println);
		
		//Desafio 18 - Verifique se todos os n�meros da lista s�o iguais:
		System.out.println("Verifique se todos os n�meros da lista s�o iguais");
		if (numeros.stream().distinct().count() == 1) {
			System.out.println("Todos os elementos s�o iguais");
		}else {
			System.out.println("Elementos s�o diferentes");
		}
		
		//Desafio 19 - Encontre a soma dos n�meros divis�veis por 3 e 5:
		System.out.println("Encontre a soma dos n�meros divis�veis por 3 e 5");
		System.out.println(numeros.stream().filter(n -> (n % 3 == 0 && n % 5 == 0)).reduce(0, (n1, n2) -> n1 + n2));
	}
}