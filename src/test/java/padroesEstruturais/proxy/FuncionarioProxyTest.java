package padroesEstruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroesProjeto.padroesEstruturais.proxy.BD;
import padroesProjeto.padroesEstruturais.proxy.Funcionario;
import padroesProjeto.padroesEstruturais.proxy.FuncionarioProxy;
import padroesProjeto.padroesEstruturais.proxy.Gerente;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FuncionarioProxyTest {

    @BeforeEach
    void setUp() {
        BD.addFuncionario(new Funcionario(1, "João", "Juiz de Fora","Junior", 2000.0f));
        BD.addFuncionario(new Funcionario(2, "Maria", "Juiz de Fora","Pleno", 5000.0f));
    }

    @Test
    void deveRetornarDadosPessoaisFuncionario() {
        FuncionarioProxy funcionario = new FuncionarioProxy(1);

        assertEquals(Arrays.asList("João", "Juiz de Fora"), funcionario.obterDadosPessoais());
    }

    @Test
    void deveRetornarSalarioFuncionario() {
        Gerente gerente = new Gerente("Ana", "RH");
        FuncionarioProxy funcionario = new FuncionarioProxy(2);

        assertEquals(Arrays.asList(5000.0f), funcionario.obterSalarios(gerente));
    }

    @Test
    void deveRetornarExcecaoGerenteNaoAutorizadoConsultarSalarioFuncionario() {
        try {
            Gerente gerente = new Gerente("Joana", "TI");
            FuncionarioProxy funcionario = new FuncionarioProxy(2);

            funcionario.obterSalarios(gerente);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Gerente não autorizado", e.getMessage());
        }
    }

}
