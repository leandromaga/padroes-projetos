package padroesProjeto.padroesEstruturais.facade.exemploPassageiro;

public class CartaoVacina extends Documentos {

    private static CartaoVacina cartaoVacina = new CartaoVacina();

    private CartaoVacina() {
    }

    public static CartaoVacina getInstance() {
        return cartaoVacina;
    }
}
