package padroesProjeto.factoryMethod;

public class ServicoConsultoria implements IServico{

    public String executar() {
        return "Consultoria efetivada";
    }

    public String cancelar() {
        return "Consultoria cancelada";
    }
}
