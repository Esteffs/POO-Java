package aplications;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for(String x : list)
		{
			System.out.println(x);
		}
		
		//Removendo itens da lista
		System.out.println("-------------------");
		list.removeIf(x -> x.charAt(0) == 'M');//Predicado - Função Lambda
		for(String x : list)
		{
			System.out.println(x);
		}
		
		//Usando stream - Expressão Lambda
		System.out.println("-------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result)
		{
			System.out.println(x);
		}
		
		//Usando findFirst = Expressão Lambda
		System.out.println("-------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}
}
