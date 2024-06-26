package padroesComportamentais.interpreter;

import org.junit.jupiter.api.Test;

import padroesProjeto.padroesComportamentais.interpreter.InterpretadorComandos;
import padroesProjeto.padroesComportamentais.interpreter.SistemaDeControle;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SistemaAutomacaoTest {

    @Test
    public void testSetAndGetTemperatura() {
        SistemaDeControle sistemaDeControle = new SistemaDeControle();
        sistemaDeControle.setTemperatura(22);
        assertEquals("Deve obter a temperatura correta.", 22, sistemaDeControle.getTemperatura());
    }

    @Test
    public void testSetAndGetUmidade() {
        SistemaDeControle  contexto = new SistemaDeControle();
        contexto.setUmidade(45);
        assertEquals("Deve obter a umidade correta.", 45, contexto.getUmidade());
    }

    @Test
    public void testAumentarTemperatura() {
        SistemaDeControle  sistemaDeControle = new SistemaDeControle();
        sistemaDeControle.setTemperatura(20);
        InterpretadorComandos.interpretar("temperatura +5", sistemaDeControle);
        assertEquals("Deve aumentar a temperatura em 5 graus.", 25, sistemaDeControle.getTemperatura());
    }

    @Test
    public void testDiminuirTemperatura() {
        SistemaDeControle  contexto = new SistemaDeControle ();
        contexto.setTemperatura(20);
        InterpretadorComandos.interpretar("temperatura -3", contexto);
        assertEquals("Deve diminuir a temperatura em 3 graus.", 17, contexto.getTemperatura());
    }

    @Test
    public void testDefinirTemperatura() {
        SistemaDeControle  contexto = new SistemaDeControle ();
        contexto.setTemperatura(20);
        InterpretadorComandos.interpretar("temperatura =25", contexto);
        assertEquals("Deve definir a temperatura para 25 graus.", 25, contexto.getTemperatura());
    }

    @Test
    public void testAumentarUmidade() {
        SistemaDeControle  contexto = new SistemaDeControle();
        contexto.setUmidade(40);
        InterpretadorComandos.interpretar("umidade +10", contexto);
        assertEquals("Deve aumentar a umidade em 10%.", 50, contexto.getUmidade());
    }

    @Test
    public void testDiminuirUmidade() {
        SistemaDeControle contexto = new SistemaDeControle();
        contexto.setUmidade(40);
        InterpretadorComandos.interpretar("umidade -20", contexto);
        assertEquals("Deve diminuir a umidade em 20%.", 20, contexto.getUmidade());
    }

    @Test
    public void testDefinirUmidade() {
        SistemaDeControle contexto = new SistemaDeControle();
        contexto.setUmidade(40);
        InterpretadorComandos.interpretar("umidade =55", contexto);
        assertEquals("Deve definir a umidade para 55%.", 55, contexto.getUmidade());
    }

    @Test
    public void testInvalidCommand() {
        SistemaDeControle contexto = new SistemaDeControle();
        try {
            InterpretadorComandos.interpretar("invalido 100", contexto);
            fail("Deve lançar uma exceção para comandos inválidos.");
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de comando desconhecido: invalido", e.getMessage());
        }
    }

    @Test
    public void testOperacaoInvalida() {
        SistemaDeControle contexto = new SistemaDeControle();
        try {
            InterpretadorComandos.interpretar("temperatura x5", contexto);
            fail("Deve lançar uma exceção para operações inválidas.");
        } catch (IllegalArgumentException e) {
            assertEquals("Operação inválida. Deve ser '+', '-' ou '=' seguido por um número.", e.getMessage());
        }
    }

    @Test
    public void testFormatoComandoInvalido() {
        SistemaDeControle contexto = new SistemaDeControle();
        try {
            InterpretadorComandos.interpretar("temperatura", contexto);
            fail("Deve lançar uma exceção para formato de comando inválido.");
        } catch (IllegalArgumentException e) {
            assertEquals("Comando inválido. Formato esperado: 'tipo +|-|= valor'.", e.getMessage());
        }
    }
}