package ed.conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteDOConjunto {
	
	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Mouta");
		System.out.println(conjunto);
		
		conjunto.adiciona("Mouta");
		System.out.println(conjunto);
		
		conjunto.adiciona("Maya");
		conjunto.adiciona("Marlene");
		System.out.println(conjunto);
		
		conjunto.remove("Mauricio");
		System.out.println(conjunto);
		
		Set<String> conjuntoDoJava = new HashSet<String>();
		
		conjuntoDoJava.add("Caio");
		conjuntoDoJava.add("Eduardo");
		
		System.out.println(conjuntoDoJava);
		
		String x = "CAIO";
		x.hashCode();
		
		System.out.println("CAIO".hashCode());
		System.out.println("CAIO".hashCode());
	
	}

}
