package padroesProjeto.padroesComportamentais.memento;

public class ApartamentoEstadoVistoria implements ApartamentoEstado{

    private ApartamentoEstadoVistoria() {
    }

    private static ApartamentoEstadoVistoria instance = new ApartamentoEstadoVistoria();

    public static ApartamentoEstadoVistoria getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Vistoria";
    }

}
