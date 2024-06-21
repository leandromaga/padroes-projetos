package padroesComportamentais.command;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.command.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CommandPatternTest {

    @Test
    public void testAvaliacaoDesempenho() {
        Funcionario funcionario = new Funcionario("João", "RH", 3000);
        Command comando = new AvaliacaoDesempenhoCmd(funcionario);

        ControladorDeAcoes controlador = new ControladorDeAcoes();
        controlador.executarComando(comando);
    }

    @Test
    public void testAumentoSalario() {
        Funcionario funcionario = new Funcionario("Maria", "Advogada", 3000.0);
        Command comando = new AumentoSalarioCmd(funcionario, 500.0);

        ControladorDeAcoes controlador = new ControladorDeAcoes();
        controlador.executarComando(comando);

        assertEquals(3500.0, funcionario.getSalario(), 0.01);


    }

    @Test
    public void testPromocao() {
        Funcionario funcionario = new Funcionario("Carlos", "Engenheiro", 7000);
        Command comando = new PromocaoCmd(funcionario);

        ControladorDeAcoes controlador = new ControladorDeAcoes();
        controlador.executarComando(comando);


    }

    @Test
    public void testDesfazerERefazer() {
        Funcionario funcionario = new Funcionario("Ana", "Advogada", 6000);
        Command comandoPromocao = new PromocaoCmd(funcionario);
        Command comandoAvaliacao = new AvaliacaoDesempenhoCmd(funcionario);

        ControladorDeAcoes controlador = new ControladorDeAcoes();
        controlador.executarComando(comandoPromocao);
        controlador.executarComando(comandoAvaliacao);

        controlador.desfazerComando();
        controlador.refazerComando();
    }
}