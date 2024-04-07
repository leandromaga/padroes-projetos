package padroesProjeto.padroesEstruturais.decorator;

public class Hd extends NotebookDecorator{

    public Hd(Notebook notebook) {
        super(notebook);
    }

    public float getPrecoUpgrade() {
        return 500;
    }

    public String getNomeUpgrade() {
        return "HD";
    }

}
