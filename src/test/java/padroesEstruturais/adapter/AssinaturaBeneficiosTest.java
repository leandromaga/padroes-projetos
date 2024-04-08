package padroesEstruturais.adapter;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesEstruturais.adapter.AssinaturaBeneficios;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssinaturaBeneficiosTest {

    @Test
    public void testSetAndGetBeneficios() {
        AssinaturaBeneficios beneficios = new AssinaturaBeneficios();
        beneficios.setBeneficios("Premium");
        assertEquals("Premium", beneficios.getBeneficios());
    }
}
