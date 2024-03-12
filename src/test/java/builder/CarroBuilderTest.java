package builder;

import org.junit.jupiter.api.Test;
import padroesProjeto.builder.Carro;
import padroesProjeto.builder.CarroBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
public class CarroBuilderTest {

    @Test
    void deveRetornarExcecaoParaCarroSemMarca() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Modelo 1")
                    .setAno(2021)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCarroSemAno() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Modelo 1")
                    .setMarca("Marca 1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setModelo("Modelo 1")
                .setMarca("Marca 1")
                .setAno(2021)
                .build();

        assertEquals("Modelo 1", carro.getModelo());
        assertEquals("Marca 1", carro.getMarca());
        assertEquals(2021, carro.getAno());
    }

    @Test
    void deveDefinirEObterNumPortas() {
        Carro carro = new CarroBuilder()
                .setMarca("Marca 1")
                .setAno(2021)
                .setNumPortas(4)
                .build();
        assertEquals(4, carro.getNumPortas());
    }

    @Test
    void deveDefinirEObterCombustivel() {
        Carro carro = new CarroBuilder()
                .setMarca("Marca 1")
                .setAno(2021)
                .setCombustivel("Gasolina")
                .build();
        assertEquals("Gasolina", carro.getCombustivel());
    }

    @Test
    void deveDefinirEObterCambio() {
        Carro carro = new CarroBuilder()
                .setMarca("Marca 1")
                .setAno(2021)
                .setCambio("Automático")
                .build();
        assertEquals("Automático", carro.getCambio());
    }

    @Test
    void deveDefinirEObterCor() {
        Carro carro = new CarroBuilder()
                .setMarca("Marca 1")
                .setAno(2021)
                .setCor("Preto")
                .build();
        assertEquals("Preto", carro.getCor());
    }

    @Test
    void deveDefinirEObterDirecao() {
        Carro carro = new CarroBuilder()
                .setMarca("Marca 1")
                .setAno(2021)
                .setDirecao("Hidráulica")
                .build();
        assertEquals("Hidráulica", carro.getDirecao());
    }

    @Test
    void deveRetornarCarroCompleto() {
        Carro carro = new CarroBuilder()
                .setModelo("Modelo Completo")
                .setMarca("Marca Completa")
                .setAno(2021)
                .setNumPortas(4)
                .setCombustivel("Gasolina")
                .setCambio("Automático")
                .setCor("Azul")
                .setDirecao("Elétrica")
                .build();

        assertEquals("Modelo Completo", carro.getModelo());
        assertEquals("Marca Completa", carro.getMarca());
        assertEquals(2021, carro.getAno());
        assertEquals(4, carro.getNumPortas());
        assertEquals("Gasolina", carro.getCombustivel());
        assertEquals("Automático", carro.getCambio());
        assertEquals("Azul", carro.getCor());
        assertEquals("Elétrica", carro.getDirecao());
    }
}