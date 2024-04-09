package padroesEstruturais.brigde;

import org.junit.jupiter.api.Test;

import padroesProjeto.padroesEstruturais.brigde.Desenvolvedor;
import padroesProjeto.padroesEstruturais.brigde.IExperiencia;
import padroesProjeto.padroesEstruturais.brigde.Junior;
import padroesProjeto.padroesEstruturais.brigde.Pleno;
import padroesProjeto.padroesEstruturais.brigde.Senior;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {
    @Test
    public void retornarSalarioComBonusParaJunior() {
        IExperiencia experiencia = new Junior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(3200.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(3520.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    public void retornarSalarioComBonusParaPleno() {
        IExperiencia experiencia = new Pleno();
        Desenvolvedor desenvolvedor = new Desenvolvedor(6900.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(7935.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    public void retornarSalarioComBonusParaSenior() {
        IExperiencia experiencia = new Senior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(10000.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(12000.0f, desenvolvedor.calcularSalario(), 0.01f);
    }
}