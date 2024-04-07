package padroesCriacao.factoryMethod;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesCriacao.factoryMethod.IServico;
import padroesProjeto.padroesCriacao.factoryMethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoVendaTeste {

    @Test
    void deveExecutarVenda() {
        IServico servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda efetivada", servico.executar());
    }

    @Test
    void deveCancelarVenda() {
        IServico servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda cancelada", servico.cancelar());
    }
}
