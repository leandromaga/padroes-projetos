package padroesCriacao.factoryMethod;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesCriacao.factoryMethod.IServico;
import padroesProjeto.padroesCriacao.factoryMethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoConsultoria {

    @Test
    void deveExecutarConsultoria() {
        IServico servico = ServicoFactory.obterServico("Consultoria");
        assertEquals("Consultoria efetivada", servico.executar());
    }

    @Test
    void deveCancelarConsultoria() {
        IServico servico = ServicoFactory.obterServico("Consultoria");
        assertEquals("Consultoria cancelada", servico.cancelar());
    }

}
