package padroesProjeto.padroesComportamentais.strategy;

public class BonusDoutorado implements BonusStrategy {

    @Override
    public double aplicarBonus(double salario) {
        return salario * 0.25;
    }

}
