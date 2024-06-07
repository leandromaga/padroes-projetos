package padroesCriacao.factoryMethod;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesCriacao.factoryMethod.*;
import padroesProjeto.padroesCriacao.factoryMethod.*;
import padroesProjeto.padroesCriacao.factoryMethod.ServicoConsultoria;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceFactoryTest {

    @Test
    public void deveRetornarServicoAluguel() {
        IServico servico = ServicoFactory.obterServico("Aluguel");
        assertTrue(servico instanceof ServicoAluguel);
        assertEquals("Aluguel efetivado", servico.executar());
        assertEquals("Aluguel cancelado", servico.cancelar());
    }

    @Test
    public void deveRetornarServicoConsultoria() {
        IServico servico = ServicoFactory.obterServico("Consultoria");
        assertTrue(servico instanceof ServicoConsultoria);
        assertEquals("Consultoria efetivada", servico.executar());
        assertEquals("Consultoria cancelada", servico.cancelar());
    }

    @Test
    public void deveRetornarServicoVenda() {
        IServico servico = ServicoFactory.obterServico("Venda");
        assertTrue(servico instanceof ServicoVenda);
        assertEquals("Venda efetivada", servico.executar());
        assertEquals("Venda cancelada", servico.cancelar());
    }


    @Test
    public void deveLancarExcecaoParaServicoInexistente() {
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
            ServicoFactory.obterServico("Inexistente");
        });
        assertEquals("Serviço inexistente", excecao.getMessage());
    }

    //    @Test
//    public void deveRetornarServicoVistoria() {
//        IServico servico = ServicoFactory.obterServico("Vistoria");
//        assertTrue(servico instanceof ServicoVistoria);
//        assertEquals("Vistoria efetivada", servico.executar());
//        assertEquals("Vistoria cancelada", servico.cancelar());
//    }


}
