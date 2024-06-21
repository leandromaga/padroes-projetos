package padroesProjeto.padroesEstruturais.facade.exemploPassageiro;

public class PassageiroFacade {

    public static boolean verificarDocumentosObrigatorios(Passageiro passageiro) {
        if (Passaporte.getInstance().verificarPassageiroComDocumentoFaltante(passageiro)) {
            return false;
        }
        if (Visto.getInstance().verificarPassageiroComDocumentoFaltante(passageiro)) {
            return false;
        }
        if (CartaoVacina.getInstance().verificarPassageiroComDocumentoFaltante(passageiro)) {
            return false;
        }
        return true;
    }

}
