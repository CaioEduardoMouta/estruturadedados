package ed;

public class aluno {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object ) {
        Aluno outro = (aluno) obj;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}