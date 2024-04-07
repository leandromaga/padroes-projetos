package padroesEstruturais.flyweight;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesEstruturais.flyweight.Concessionaria;
import padroesProjeto.padroesEstruturais.flyweight.MarcaFactory;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcessionariaTest {

    @Test
    void deveRetornarCarros() {
        Concessionaria concessionaira = new Concessionaria();
        concessionaira.cadastrar("Uno", "Fiat", "Itália");
        concessionaira.cadastrar("Gol", "Volkswagen", "Alemanha");
        concessionaira.cadastrar("Siena", "Fiat", "Itália");
        concessionaira.cadastrar("Polo", "Volkswagen", "Alemanha");

        List<String> saida = Arrays.asList(
                "Carro{modelo='Uno', marca='Fiat', pais='Itália'}",
                "Carro{modelo='Gol', marca='Volkswagen', pais='Alemanha'}",
                "Carro{modelo='Siena', marca='Fiat', pais='Itália'}",
                "Carro{modelo='Polo', marca='Volkswagen', pais='Alemanha'}");

        assertEquals(saida, concessionaira.obterCarros()
        );
    }

    @Test
    void deveRetonarTotalMarcas() {
        Concessionaria concessionaira = new Concessionaria();
        concessionaira.cadastrar("Uno", "Fiat", "Itália");
        concessionaira.cadastrar("Gol", "Volkswagen", "Alemanha");
        concessionaira.cadastrar("Siena", "Fiat", "Itália");
        concessionaira.cadastrar("Polo", "Volkswagen", "Alemanha");

        assertEquals(2, MarcaFactory.getTotalMarcas());
    }


}
