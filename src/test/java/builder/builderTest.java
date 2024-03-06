package builder;

import org.junit.jupiter.api.Test;
import padroesProjeto.builder.Carro;
import padroesProjeto.builder.CarroBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class builderTest {

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

}
