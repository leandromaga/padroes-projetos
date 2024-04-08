package padroesProjeto.padroesEstruturais.composite;

public class Loja {

    private Armazem estoque;

    public void setEstoque(Armazem estoque) {
        this.estoque = estoque;
    }

    public String getEstoque() {
        if (this.estoque == null) {
            throw new NullPointerException("Loja sem produtos no estoque");
        }
        return this.estoque.getArmazem();
    }


}
