package padroesEstruturais.facade;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesEstruturais.facade.exemploPassageiro.CartaoVacina;
import padroesProjeto.padroesEstruturais.facade.exemploPassageiro.Passageiro;
import padroesProjeto.padroesEstruturais.facade.exemploPassageiro.Passaporte;
import padroesProjeto.padroesEstruturais.facade.exemploPassageiro.Visto;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {

    @Test
    public void deveRetornarDocuemntoFaltantePassaporte() {
        Passageiro passageiro = new Passageiro();
        Passaporte.getInstance().addPassageiroComDocumentoFaltante(passageiro);

        assertEquals(false, passageiro.solicitarPassagem());
    }

    @Test
    public void deveRetornarDocumentoFaltanteVisto() {
        Passageiro passageiro = new Passageiro();
        Visto.getInstance().addPassageiroComDocumentoFaltante(passageiro);

        assertEquals(false, passageiro.solicitarPassagem());
    }

    @Test
    public void deveRetornarDocumentoFaltanteCartaoVacina() {
        Passageiro passageiro = new Passageiro();
        CartaoVacina.getInstance().addPassageiroComDocumentoFaltante(passageiro);

        assertEquals(false, passageiro.solicitarPassagem());
    }

    @Test
    public void deveRetornarPassageiroSemDocumentoFaltante() {
        Passageiro passageiro = new Passageiro();

        assertEquals(true, passageiro.solicitarPassagem());
    }


}
