package padroesProjeto.padroesComportamentais.strategy;

public class BonusPosGraduacao implements BonusStrategy {

    @Override
    public double aplicarBonus(double salario) {
        return salario * 0.15;
    }
}
