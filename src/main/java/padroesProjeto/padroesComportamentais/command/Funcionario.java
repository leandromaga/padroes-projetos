package padroesProjeto.padroesComportamentais.command;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void acaoAvaliacao() {
        System.out.println(nome + " teve seu desempenho avaliado.");
    }

    public void acaoAumentoSalario(double valor) {
        this.salario += valor;
        System.out.println(nome + " teve um aumento de salário de " + valor + ". Novo salário: " + salario);
    }

    public void acaoDiminuirSalario(double valor) {
        this.salario -= valor;
        System.out.println(nome + " teve uma diminuição de salário de " + valor + ". Novo salário: " + salario);
    }

    public void acaoPromocao(String novoCargo) {
        this.cargo = novoCargo;
        System.out.println(nome + " foi promovido para " + cargo);
    }

    public void acaoDespromocao() {
        System.out.println(nome + " teve sua promoção desfeita.");
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
