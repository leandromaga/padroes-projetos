package padroesComportamentais.mediator;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.mediator.CoordenadorEventos;
import padroesProjeto.padroesComportamentais.mediator.Evento;
import padroesProjeto.padroesComportamentais.mediator.Participante;
import padroesProjeto.padroesComportamentais.mediator.SuporteTecnico;

import static org.junit.Assert.assertEquals;

public class EventosMediatorTest {

    @Test
    void deveIniciarParticipacao() {
        Participante participante = new Participante();
        assertEquals("O Coordenador de Eventos iniciou o evento.\n" +
                        "O Suporte Técnico preparou tudo conforme o necessário.\n" +
                        ">>O Suporte Técnico preparou o local para o evento: Preparativos completos",
                participante.iniciarParticipacao("Preparativos completos"));
    }

    @Test
    void deveEncerrarParticipacao() {
        Participante participante = new Participante();
        assertEquals("O Coordenador de Eventos encerrou o evento.\n" +
                        "O Suporte Técnico desmontou a estrutura conforme necessário.\n" +
                        ">>O Suporte Técnico desmontou o local após o evento: Desmontagem completa",
                participante.encerrarParticipacao("Desmontagem completa"));
    }

    @Test
    void deveCoordenarInicio() {
        CoordenadorEventos coordenador = CoordenadorEventos.getInstancia();
        assertEquals("O Coordenador de Eventos iniciou o evento.\n" +
                        "O Suporte Técnico preparou tudo conforme o necessário.\n" +
                        ">>O Suporte Técnico preparou o local para o evento: Preparando palco",
                coordenador.coordenarInicio("Preparando palco"));
    }

    @Test
    void deveCoordenarEncerramento() {
        CoordenadorEventos coordenador = CoordenadorEventos.getInstancia();
        assertEquals("O Coordenador de Eventos encerrou o evento.\n" +
                        "O Suporte Técnico desmontou a estrutura conforme necessário.\n" +
                        ">>O Suporte Técnico desmontou o local após o evento: Limpando área",
                coordenador.coordenarEncerramento("Limpando área"));
    }

    @Test
    void devePrepararEvento() {
        SuporteTecnico suporte = SuporteTecnico.getInstancia();
        assertEquals("O Suporte Técnico preparou o local para o evento: Configurações técnicas",
                suporte.prepararEvento("Configurações técnicas"));
    }

    @Test
    void deveDesmontarEvento() {
        SuporteTecnico suporte = SuporteTecnico.getInstancia();
        assertEquals("O Suporte Técnico desmontou o local após o evento: Retirada de equipamentos",
                suporte.desmontarEvento("Retirada de equipamentos"));
    }
    @Test
    void deveIniciarParticipacaoComoEvento() {
        Evento evento = new Evento();
        assertEquals("O Coordenador de Eventos iniciou o evento.\n" +
                        "O Suporte Técnico preparou tudo conforme o necessário.\n" +
                        ">>O Suporte Técnico preparou o local para o evento: Preparativos completos",
                evento.iniciarParticipacao("Preparativos completos"));
    }

    @Test
    void deveEncerrarParticipacaoComoEvento() {
        Evento evento = new Evento();
        assertEquals("O Coordenador de Eventos encerrou o evento.\n" +
                        "O Suporte Técnico desmontou a estrutura conforme necessário.\n" +
                        ">>O Suporte Técnico desmontou o local após o evento: Desmontagem completa",
                evento.encerrarParticipacao("Desmontagem completa"));
    }
}