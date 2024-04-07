package padroesProjeto.padroesCriacao.abstractFactory;

public class Funcionario {

    private Salario salario;
    private Bonus bonus;

    public Funcionario(FabricaAbstrata fabrica) {
        this.salario = fabrica.createSalario();
        this.bonus = fabrica.createBonus();
    }

    public Float calcularSalario() {
        return salario.calcular();
    }

    public Float calcularBonus() {
        return bonus.calcular();
    }

}
