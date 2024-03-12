package padroesProjeto.factoryMethod;

public class ServicoAluguel implements IServico {

    @Override
    public String executar() {
        return "Aluguel efetivado";
    }

    @Override
    public String cancelar() {
        return "Aluguel cancelado";
    }
}
