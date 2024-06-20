package padroesProjeto.padroesComportamentais.command;

public class AumentoSalarioCmd implements Command{
    private Funcionario funcionario;
    private double valorAumento;

    public AumentoSalarioCmd(Funcionario funcionario, double valorAumento) {
        this.funcionario = funcionario;
        this.valorAumento = valorAumento;
    }

    @Override
    public void execute() {
        funcionario.acaoAumentoSalario(valorAumento);
    }

    @Override
    public void undo() {
        funcionario.acaoDiminuirSalario(valorAumento);
    }
}
