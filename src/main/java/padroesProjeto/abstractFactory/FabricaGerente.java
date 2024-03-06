package padroesProjeto.abstractFactory;

public class FabricaGerente implements FabricaAbstrata{

    @Override
    public Salario createSalario(){
        return new SalarioGerente();
    }

    @Override
    public Bonus createBonus(){
        return new BonusGerente();
    }

}
