package padroesProjeto.padroesEstruturais.facade.exemploPassageiro;

public class Passaporte extends Documentos {

    private static Passaporte passaporte = new Passaporte();

    private Passaporte() {
    }

    public static Passaporte getInstance() {
        return passaporte;
    }

}
