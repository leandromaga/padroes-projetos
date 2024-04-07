package padroesProjeto.padroesEstruturais.decorator;

public class NotebookSimples implements Notebook{

    public float precoTotal;

    public NotebookSimples() {
    }

    public NotebookSimples(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public String getUpgrade() {
        return "Notebook simples";
    }

}
