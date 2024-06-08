package padroesComportamentais.memento;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.memento.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApartamentoTeste {

    @Test
    public void deveArmazenarEstados() {
        Apartamento apartamento = new Apartamento();
        apartamento.setEstado(ApartamentoEstadoAlugado.getInstance());
        apartamento.setEstado(ApartamentoEstadoDisponivel.getInstance());
        apartamento.setEstado(ApartamentoEstadoReformado.getInstance());
        apartamento.setEstado(ApartamentoEstadoVistoria.getInstance());
        apartamento.setEstado(ApartamentoEstadoVendido.getInstance());
        assertEquals(5, apartamento.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        Apartamento apartamento = new Apartamento();
        apartamento.setEstado(ApartamentoEstadoAlugado.getInstance());
        apartamento.setEstado(ApartamentoEstadoDisponivel.getInstance());
        apartamento.restauraEstado(0);
        assertEquals(ApartamentoEstadoAlugado.getInstance(), apartamento.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior() {
        Apartamento apartamento = new Apartamento();
        apartamento.setEstado(ApartamentoEstadoAlugado.getInstance());
        apartamento.setEstado(ApartamentoEstadoDisponivel.getInstance());
        apartamento.setEstado(ApartamentoEstadoAlugado.getInstance());
        apartamento.setEstado(ApartamentoEstadoDisponivel.getInstance());
        apartamento.restauraEstado(2);
        assertEquals(ApartamentoEstadoAlugado.getInstance(), apartamento.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
            Apartamento apartamento = new Apartamento();
            apartamento.restauraEstado(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }


}
