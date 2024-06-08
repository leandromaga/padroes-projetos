package padroesProjeto.padroesComportamentais.memento;

public class ApartamentoEstadoAlugado implements ApartamentoEstado {

    private ApartamentoEstadoAlugado() {
    }

    private static ApartamentoEstadoAlugado instance = new ApartamentoEstadoAlugado();

    public static ApartamentoEstadoAlugado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Alugado";
    }




}
