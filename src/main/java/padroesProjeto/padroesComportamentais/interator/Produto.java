package padroesProjeto.padroesComportamentais.interator;

public class Produto {

    private String nome;

    private boolean emFalta;

    public Produto(String nome, boolean emFalta) {
        this.nome = nome;
        this.emFalta = emFalta;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEmFalta() {
        return emFalta;
    }



}
