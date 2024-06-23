package padroesComportamentais.visitor;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.visitor.Apartamento;
import padroesProjeto.padroesComportamentais.visitor.Casa;
import padroesProjeto.padroesComportamentais.visitor.ImovelVisitor;
import padroesProjeto.padroesComportamentais.visitor.SalaComercial;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImovelTest {

    @Test
    void deveExibirCasa() {
        Casa casa = new Casa(100.0, "Rua A");

        ImovelVisitor visitor = new ImovelVisitor();
        assertEquals("Casa{metragem=100.0, endereco='Rua A'}", visitor.exibirCasa(casa));
    }

    @Test
    void deveExibirApartamento() {
        Apartamento apartamento = new Apartamento(50.0, "1º andar");

        ImovelVisitor visitor = new ImovelVisitor();
        assertEquals("Apartamento{metragem=50.0, andar='1º andar'}", visitor.exibirApartamento(apartamento));
    }

    @Test
    void deveExibirSalaComercial() {
        SalaComercial salaComercial = new SalaComercial(30.0, "Centro");

        ImovelVisitor visitor = new ImovelVisitor();
        assertEquals("Sala Comercial{metragem=30.0, bairro='Centro'}", visitor.exibirSalaComercial(salaComercial));
    }

}
