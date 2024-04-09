package padroesEstruturais.brigde;


import padroesProjeto.padroesEstruturais.brigde.AnalistaDados;
import padroesProjeto.padroesEstruturais.brigde.IExperiencia;
import padroesProjeto.padroesEstruturais.brigde.Junior;
import padroesProjeto.padroesEstruturais.brigde.Pleno;
import padroesProjeto.padroesEstruturais.brigde.Senior;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnalistaDadosTest {
    @Test
    public void retornarSalarioComBonusParaJunior() {
        IExperiencia experiencia = new Junior();
        AnalistaDados analistaDados = new AnalistaDados(3700.0f);
        analistaDados.setExperiencia(experiencia);
        assertEquals(4070.0f, analistaDados.calcularSalario(), 0.01f);
    }

    @Test
    public void retornarSalarioComBonusParaPleno() {
        IExperiencia experiencia = new Pleno();
        AnalistaDados analistaDados = new AnalistaDados(6200.0f);
        analistaDados.setExperiencia(experiencia);
        assertEquals(7130.0f, analistaDados.calcularSalario(), 0.01f);
    }

    @Test
    public void retornarSalarioComBonusParaSenior() {
        IExperiencia experiencia = new Senior();
        AnalistaDados analistaDados = new AnalistaDados(8500.0f);
        analistaDados.setExperiencia(experiencia);
        assertEquals(10200.0f, analistaDados.calcularSalario(), 0.01f);
    }
}