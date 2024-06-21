package padroesProjeto.padroesEstruturais.facade.exemploPassageiro;

public class Visto extends Documentos {

    private static Visto visto = new Visto();

    private Visto() {
    }

    public static Visto getInstance() {
        return visto;
    }

}
