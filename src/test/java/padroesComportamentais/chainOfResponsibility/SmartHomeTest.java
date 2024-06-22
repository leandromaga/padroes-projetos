package padroesComportamentais.chainOfResponsibility;


import org.junit.Before;
import org.junit.Test;
import padroesProjeto.padroesComportamentais.chainOfResponsibility.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
public class SmartHomeTest {

    private SistemaIluminacao sistemaIluminacao;
    private SistemaSom sistemaSom;
    private SistemaClimatizacao sistemaClimatizacao;

    @Before
    public void setUp() {
        sistemaClimatizacao = new SistemaClimatizacao();
        sistemaSom = new SistemaSom(sistemaClimatizacao);
        sistemaIluminacao = new SistemaIluminacao(sistemaSom);
    }

    @Test
    public void testSistemaIluminacaoProcessaEventoLuz() {
        Evento eventoLuz = new Evento(TipoEventoLuz.getTipoEventoLuz(), "Ligar luzes da sala");
        String resultado = sistemaIluminacao.processarEvento(eventoLuz);
        assertEquals("Sistema de Iluminação processou Ligar luzes da sala", resultado);
    }

    @Test
    public void testSistemaSomProcessaEventoSom() {
        Evento eventoSom = new Evento(TipoEventoSom.getTipoEventoSom(), "Tocar música ambiente");
        String resultado = sistemaSom.processarEvento(eventoSom);
        assertEquals("Sistema de Som processou Tocar música ambiente", resultado);
    }

    @Test
    public void testSistemaClimatizacaoProcessaEventoTemperatura() {
        Evento eventoTemperatura = new Evento(TipoEventoTemperatura.getTipoEventoTemperatura(), "Ajustar temperatura para 22°C");
        String resultado = sistemaClimatizacao.processarEvento(eventoTemperatura);
        assertEquals("Sistema de Climatização processou Ajustar temperatura para 22°C", resultado);
    }

    @Test
    public void testEventoNaoTratavel() {
        Evento eventoDesconhecido = new Evento(new TipoEvento() {}, "Evento desconhecido");
        String resultado = sistemaIluminacao.processarEvento(eventoDesconhecido);
        assertEquals("Evento não processado", resultado);
    }

    @Test
    public void testEncaminhamentoDeEvento() {
        Evento eventoSom = new Evento(TipoEventoSom.getTipoEventoSom(), "Baixar volume");
        String resultado = sistemaIluminacao.processarEvento(eventoSom);
        assertEquals("Sistema de Som processou Baixar volume", resultado);
    }

    @Test
    public void testAcessoDispositivoSuperior() {
        assertEquals(sistemaSom, sistemaIluminacao.getDispositivoSuperior());
        assertEquals(sistemaClimatizacao, sistemaSom.getDispositivoSuperior());
        assertNull(sistemaClimatizacao.getDispositivoSuperior());
    }

    @Test
    public void testSemSuperior() {
        SistemaSom somSolo = new SistemaSom(null);
        Evento eventoSom = new Evento(TipoEventoSom.getTipoEventoSom(), "Ajustar equalização");
        String resultado = somSolo.processarEvento(eventoSom);
        assertEquals("Sistema de Som processou Ajustar equalização", resultado);
    }

    @Test
    public void testMudancaNoEncadeamento() {
        SistemaIluminacao novoSistemaIluminacao = new SistemaIluminacao(sistemaClimatizacao);
        Evento eventoLuz = new Evento(TipoEventoLuz.getTipoEventoLuz(), "Diminuir luzes da sala");
        String resultado = novoSistemaIluminacao.processarEvento(eventoLuz);
        assertEquals("Sistema de Iluminação processou Diminuir luzes da sala", resultado);
    }
}