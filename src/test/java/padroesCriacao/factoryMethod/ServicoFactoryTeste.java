package padroesCriacao.factoryMethod;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesCriacao.factoryMethod.IServico;
import padroesProjeto.padroesCriacao.factoryMethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ServicoFactoryTeste {

    @Test
    public void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Financiamento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Vistoria");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }

}
