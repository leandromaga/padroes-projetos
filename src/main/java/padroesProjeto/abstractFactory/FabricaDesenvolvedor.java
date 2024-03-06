package padroesProjeto.abstractFactory;

public class FabricaDesenvolvedor implements FabricaAbstrata{

    @Override
    public Salario createSalario(){
        return new SalarioDesenvolvedor();
    }

    @Override
    public Bonus createBonus(){
        return new BonusDesenvolvedor();
    }

}
