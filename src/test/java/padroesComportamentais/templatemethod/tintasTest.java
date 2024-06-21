package padroesComportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.templatemethod.Guache;
import padroesProjeto.padroesComportamentais.templatemethod.Oleo;
import padroesProjeto.padroesComportamentais.templatemethod.Tinta;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class tintasTest {

    @Test
    void testar() {
        Tinta oleo = new Oleo();
        Tinta guache = new Guache();

        System.out.println("Produzindo tinta a óleo:");
        oleo.produzirTinta();

        System.out.println("\nProduzindo tinta guache:");
        guache.produzirTinta();

        assertNotNull(oleo);
    }


}
