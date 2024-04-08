package padroesProjeto.padroesEstruturais.composite;

public abstract class Armazem {

    private String descricao;

    public Armazem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getArmazem();


}
