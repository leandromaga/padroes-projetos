package factoryMethod;

import org.junit.jupiter.api.Test;
import padroesProjeto.factoryMethod.IServico;
import padroesProjeto.factoryMethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoVistoriaTeste {

    @Test
    void deveExecutarVistoria() {
        IServico servico = ServicoFactory.obterServico("Vistoria");
        assertEquals("Vistoria efetivada", servico.executar());
    }

    @Test
    void deveCancelarVistoria() {
        IServico servico = ServicoFactory.obterServico("Vistoria");
        assertEquals("Vistoria cancelada", servico.cancelar());
    }
}
