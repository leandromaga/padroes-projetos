package factoryMethod;

import org.junit.jupiter.api.Test;
import padroesProjeto.factoryMethod.IServico;
import padroesProjeto.factoryMethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoAluguelTeste {

    @Test
    void deveExecutarAluguel() {
        IServico servico = ServicoFactory.obterServico("Aluguel");
        assertEquals("Aluguel efetivado", servico.executar());
    }

    @Test
    void deveCancelarAluguel() {
        IServico servico = ServicoFactory.obterServico("Aluguel");
        assertEquals("Aluguel cancelado", servico.cancelar());
    }
}
