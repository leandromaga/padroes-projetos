package padroesProjeto.padroesEstruturais.facade.exemploPassageiro;

public class Passageiro {

    public boolean solicitarPassagem() {
        return PassageiroFacade.verificarDocumentosObrigatorios(this);
    }

}
