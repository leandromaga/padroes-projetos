package padroesEstruturais.adapter;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesEstruturais.adapter.AssinaturaAdapter;
import padroesProjeto.padroesEstruturais.adapter.AssinaturaBeneficios;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssinaturaAdapterTest {
    @Test
    public void testSetAndGetTipoAssinatura() {
        AssinaturaBeneficios beneficios = new AssinaturaBeneficios();
        AssinaturaAdapter adapter = new AssinaturaAdapter(beneficios);
        adapter.setTipoAssinatura("Basic");
        assertEquals("Basic", adapter.getTipoAssinatura());
    }
}
