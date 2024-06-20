package padroesProjeto.padroesComportamentais.command;

public class PromocaoCmd implements Command {
    private Funcionario funcionario;
    private String novoCargo;

    public PromocaoCmd(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.novoCargo = novoCargo;
    }

    @Override
    public void execute() {
        funcionario.acaoPromocao(novoCargo);
    }

    @Override
    public void undo() {
        funcionario.acaoDespromocao();
    }
}
