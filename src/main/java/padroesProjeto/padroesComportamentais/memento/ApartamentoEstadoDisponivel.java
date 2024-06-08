package padroesProjeto.padroesComportamentais.memento;

public class ApartamentoEstadoDisponivel implements ApartamentoEstado{

    private ApartamentoEstadoDisponivel() {
    }

    private static ApartamentoEstadoDisponivel instance = new ApartamentoEstadoDisponivel();

    public static ApartamentoEstadoDisponivel getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Disponível";
    }

}
