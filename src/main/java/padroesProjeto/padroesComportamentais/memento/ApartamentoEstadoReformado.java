package padroesProjeto.padroesComportamentais.memento;

public class ApartamentoEstadoReformado implements ApartamentoEstado {

    private ApartamentoEstadoReformado() {
    }

    private static ApartamentoEstadoReformado instance = new ApartamentoEstadoReformado();

    public static ApartamentoEstadoReformado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Reformado";
    }

}
