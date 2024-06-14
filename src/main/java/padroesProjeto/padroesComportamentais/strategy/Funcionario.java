package padroesProjeto.padroesComportamentais.strategy;

public class Funcionario {

    private String nome;

    private double salario;

    private BonusStrategy bonusStrategy;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setBonusStrategy(BonusStrategy bonusStrategy) {
        this.bonusStrategy = bonusStrategy;
    }

    public double calcularSalarioComBonus() {
        if (bonusStrategy != null) {
            return bonusStrategy.aplicarBonus(salario);
        }
        return salario;
    }

}
