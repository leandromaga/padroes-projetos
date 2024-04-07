package padroesProjeto.padroesCriacao.factoryMethod;

public class ServicoVenda implements IServico{

    public String executar() {
        return "Venda efetivada";
    }

    public String cancelar() {
        return "Venda cancelada";
    }
}
