package padroesProjeto.padroesComportamentais.strategy;

public class BonusMestrado implements BonusStrategy {

    @Override
    public double aplicarBonus(double salario) {
        return salario * 0.2;
    }

}
