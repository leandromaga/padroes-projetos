package padroesProjeto.padroesCriacao.factoryMethod;

public class ServicoVistoria implements IServico {

    public String executar() {
        return "Vistoria efetivada";
    }

    public String cancelar() {
        return "Vistoria cancelada";
    }
}
