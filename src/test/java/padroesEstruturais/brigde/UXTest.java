package padroesEstruturais.brigde;

import org.junit.jupiter.api.Test;

import padroesProjeto.padroesEstruturais.brigde.*;

import static org.junit.jupiter.api.Assertions.*;

class UXTest {
    @Test
    public void retornarSalarioComBonusParaJunior() {
        IExperiencia experiencia = new Junior();
        UX ux = new UX(4000.0f);
        ux.setExperiencia(experiencia);
        assertEquals(4400.0f, ux.calcularSalario(), 0.01f);
    }

    @Test
    public void retornarSalarioComBonusParaPleno() {
        IExperiencia experiencia = new Pleno();
        UX ux = new UX(5000.0f);
        ux.setExperiencia(experiencia);
        assertEquals(5750.0f, ux.calcularSalario(), 0.01f);
    }

    @Test
    public void retornarSalarioComBonusParaSenior() {
        IExperiencia experiencia = new Senior();
        UX ux = new UX(9000.0f);
        ux.setExperiencia(experiencia);
        assertEquals(10800.0f, ux.calcularSalario(), 0.01f);
    }
}