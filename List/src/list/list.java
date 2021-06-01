package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Alexa");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		
//		removendo da lista pelo index  tem como remover pelo nome tbm desse jeito --------> list.remove("Alex");
		list.remove(1);
		
//		removendo da lista pela letra 
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
//		encontrando a posição do  elemento na lista
		System.out.println("index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("-------------------------");
//		Pegando somente os itens que começam com a letra A e gerando uma nova lista com todas as itens que começam com a letra A.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
//		primeiro elemento que começa com a letra A 
		String name = list.stream().filter(x -> x.charAt(0) == 'A' ).findFirst().orElse(null);
		
		System.out.println(name);
	}

}
