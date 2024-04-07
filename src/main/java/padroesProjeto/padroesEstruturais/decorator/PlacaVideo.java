package padroesProjeto.padroesEstruturais.decorator;

public class PlacaVideo extends NotebookDecorator {

    public PlacaVideo(Notebook notebook) {
        super(notebook);
    }

    public float getPrecoUpgrade() {
        return 1000;
    }

    public String getNomeUpgrade() {
        return "Placa de vídeo";
    }
}
