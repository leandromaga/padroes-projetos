package padroesProjeto.padroesComportamentais.mediator;

public class CoordenadorEventos {

    private static CoordenadorEventos instancia = new CoordenadorEventos();

    private CoordenadorEventos() {
    }

    public static CoordenadorEventos getInstancia() {
        return instancia;
    }

    public String coordenarInicio(String mensagem) {
        return "O Coordenador de Eventos iniciou o evento.\n" +
                "O Suporte Técnico preparou tudo conforme o necessário.\n" +
                ">>" + SuporteTecnico.getInstancia().prepararEvento(mensagem);
    }

    public String coordenarEncerramento(String mensagem) {
        return "O Coordenador de Eventos encerrou o evento.\n" +
                "O Suporte Técnico desmontou a estrutura conforme necessário.\n" +
                ">>" + SuporteTecnico.getInstancia().desmontarEvento(mensagem);
    }
}