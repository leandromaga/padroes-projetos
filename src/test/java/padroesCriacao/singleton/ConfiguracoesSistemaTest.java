package padroesCriacao.singleton;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesCriacao.singleton.ConfiguracoesSistema;

import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracoesSistemaTest {
    @Test
    public void deveRetornarIdiomaPadrao() {
        assertEquals("Português", ConfiguracoesSistema.getInstance().getIdioma());
        System.out.println(ConfiguracoesSistema.getInstance());
    }

    @Test
    public void deveRetornarRegiaoPadrao() {
        assertEquals("Brasil", ConfiguracoesSistema.getInstance().getRegiao());
        System.out.println(ConfiguracoesSistema.getInstance());
    }

    @Test
    public void testeSingleton() {
        assertNotNull(ConfiguracoesSistema.getInstance());
        System.out.println(ConfiguracoesSistema.getInstance());
    }
}
