package padroesComportamentais.strategy;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.strategy.*;

public class FuncionarioTeste {

    @Test
    public void deveCalcularBonusGraduacao() {
        Funcionario funcionario = new Funcionario("João", 1000.00);
        funcionario.setBonusStrategy(new BonusGraduacao());
        double salarioComBonus = funcionario.calcularSalarioComBonus();
        System.out.println("Salário com bônus de graduação: R$" + salarioComBonus);
    }

    @Test
    public void deveCalcularBonusPosGraduacao() {
        Funcionario funcionario = new Funcionario("Maria", 1000.00);
        funcionario.setBonusStrategy(new BonusPosGraduacao());
        double salarioComBonus = funcionario.calcularSalarioComBonus();
        System.out.println("Salário com bônus de pós-graduação: R$" + salarioComBonus);
    }

    @Test
    public void deveCalcularBonusMestrado() {
        Funcionario funcionario = new Funcionario("José", 1000.00);
        funcionario.setBonusStrategy(new BonusMestrado());
        double salarioComBonus = funcionario.calcularSalarioComBonus();
        System.out.println("Salário com bônus de mestrado: R$" + salarioComBonus);
    }

    @Test
    public void deveCalcularBonusDoutorado() {
        Funcionario funcionario = new Funcionario("José", 1000.00);
        funcionario.setBonusStrategy(new BonusDoutorado());
        double salarioComBonus = funcionario.calcularSalarioComBonus();
        System.out.println("Salário com bônus de doutorado: R$" + salarioComBonus);
    }

    @Test
    public void deveCalcularSalarioSemBonus() {
        Funcionario funcionario = new Funcionario("José", 1000.00);
        double salarioComBonus = funcionario.calcularSalarioComBonus();
        System.out.println("Salário sem bônus: R$" + salarioComBonus);
    }



}
