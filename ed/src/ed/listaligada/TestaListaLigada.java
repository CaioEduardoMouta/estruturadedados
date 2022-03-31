package ed.listaligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Mouta");
		System.out.println(lista);
		lista.adicionaNoComeco("Caio");
		System.out.println(lista);
		lista.adicionaNoComeco("Carrazedo");
		
		lista.adiciona(2, "Maya");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);

		
		lista.removeDoComeco();
		
		System.out.println(lista);
	
		lista.removeDoFim();
		System.out.println(lista);
		
		lista.adiciona("Jose");
		lista.adiciona("Joao");
		
		System.out.println(lista);
		
		lista.remove(1);
		
		System.out.println(lista);
		System.out.println(lista.contem("Marlene"));
		
		

		
	}
}
