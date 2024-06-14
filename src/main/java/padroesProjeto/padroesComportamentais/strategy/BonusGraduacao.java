package padroesProjeto.padroesComportamentais.strategy;

public class BonusGraduacao implements BonusStrategy{

    @Override
    public double aplicarBonus(double salario) {
        return salario * 0.1;
    }

}
