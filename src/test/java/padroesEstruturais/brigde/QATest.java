package padroesEstruturais.brigde;

import org.junit.jupiter.api.Test;

import padroesProjeto.padroesEstruturais.brigde.IExperiencia;
import padroesProjeto.padroesEstruturais.brigde.Junior;
import padroesProjeto.padroesEstruturais.brigde.Pleno;
import padroesProjeto.padroesEstruturais.brigde.QA;
import padroesProjeto.padroesEstruturais.brigde.Senior;

import static org.junit.jupiter.api.Assertions.*;

class QATest {
    @Test
    public void retornarSalarioComBonusParaJunior() {
        IExperiencia experiencia = new Junior();
        QA qa = new QA(3000.0f);
        qa.setExperiencia(experiencia);
        assertEquals(3300.0f, qa.calcularSalario(), 0.01f);
    }

    @Test
    public void retornarSalarioComBonusParaPleno() {
        IExperiencia experiencia = new Pleno();
        QA qa = new QA(4000.0f);
        qa.setExperiencia(experiencia);
        assertEquals(4600.0f, qa.calcularSalario(), 0.01f);
    }

    @Test
    public void retornarSalarioComBonusParaSenior() {
        IExperiencia experiencia = new Senior();
        QA qa = new QA(9000.0f);
        qa.setExperiencia(experiencia);
        assertEquals(10800.0f, qa.calcularSalario(), 0.01f);
    }
}