package padroesProjeto.padroesEstruturais.decorator;

public abstract class NotebookDecorator implements Notebook {

    private Notebook notebook;

    public String upgrade;

    public NotebookDecorator(Notebook notebook) {
        this.notebook = notebook;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public abstract float getPrecoUpgrade();

    public float getPrecoTotal() {
        return this.notebook.getPrecoTotal() + this.getPrecoUpgrade();
    }

    public abstract String getNomeUpgrade();

    public String getUpgrade() {
        return this.notebook.getUpgrade() + "/" + this.getNomeUpgrade();
    }

    public void setUpgrade(String upgrade) {
        this.upgrade = upgrade;
    }


}
