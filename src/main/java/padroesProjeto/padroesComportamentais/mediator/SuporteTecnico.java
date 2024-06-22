package padroesProjeto.padroesComportamentais.mediator;

public class SuporteTecnico {

    private static SuporteTecnico instancia = new SuporteTecnico();

    private SuporteTecnico() {
    }

    public static SuporteTecnico getInstancia() {
        return instancia;
    }

    public String prepararEvento(String mensagem) {
        return "O Suporte Técnico preparou o local para o evento: " + mensagem;
    }

    public String desmontarEvento(String mensagem) {
        return "O Suporte Técnico desmontou o local após o evento: " + mensagem;
    }
}