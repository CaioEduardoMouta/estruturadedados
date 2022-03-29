package ed;

import java.util.ArrayList;

public VetorTeste {

public static void main(String[]args){
    Aluno a1 = new Aluno("José");
    Aluno a2 = new Aluno("João");

    Vetor lista = new Vetor();

    lista.adiciona(a1);
    lista.adiciona(a2);

    System.out.println(lista);

    System.out.println(lista.contem(a1));

    Aluno a3 = new Aluno("Mouta");
    System.out.println(lista.contem(a3));

    lista.adiciona(1, a3);
    System.out.println(lista);

    lista.remove(1);
    System.out.println(lista);

    for(int i = 0; i  300; i++) {
        Aluno y = new Aluno("Joao" + 1);
        lista.adiciona(y);
        }
    System.out.println(lista);

    new ArrayList<Aluno> listaDoJava = new ArrayLista<Aluno>();

    }
}