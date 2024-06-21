package padroesProjeto.padroesComportamentais.command;

public class AvaliacaoDesempenhoCmd implements Command {
    private Funcionario funcionario;

    public AvaliacaoDesempenhoCmd(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public void execute() {
        funcionario.acaoAvaliacao();
    }

    @Override
    public void undo() {
        System.out.println("A avaliação de desempenho foi desfeita para " + funcionario.getNome());
    }
}
