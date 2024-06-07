package padroesProjeto.padroesEstruturais.composite;

public class Produto extends Armazem {

    private String tipo;

    public Produto(String descricao, String tipo) {
        super(descricao);
        this.tipo = tipo;
    }

    public String getArmazem() {
        return "Produto: " + this.getDescricao() + " - Tipo: " + this.tipo + "\n";
    }



}
