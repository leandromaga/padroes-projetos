package padroesEstruturais.adapter;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesEstruturais.adapter.Usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    public void testSetAndGetAssinatura() {
        Usuario usuario = new Usuario();
        usuario.setAssinatura("Gold");
        assertEquals("Gold", usuario.getAssinatura());
    }

    @Test
    public void testGetBeneficios() {
        Usuario usuario = new Usuario();
        usuario.setAssinatura("Silver");
        assertEquals("Silver", usuario.getBeneficios());
    }
}
