package padroesProjeto.padroesEstruturais.decorator;

public class Ram extends NotebookDecorator{

    public Ram(Notebook notebook) {
        super(notebook);
    }

    public float getPrecoUpgrade() {
        return 300;
    }

    public String getNomeUpgrade() {
        return "Memória RAM";
    }

}
