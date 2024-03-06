package padroesProjeto.factoryMethod;

public class ServicoFactory {

    public static IServico obterServico(String serviço) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroesProjeto.factoryMethod.Servico" + serviço);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServico) objeto;
    }


}
