package padroesProjeto.padroesComportamentais.memento;

public class ApartamentoEstadoVendido implements ApartamentoEstado{

    private ApartamentoEstadoVendido() {
    }

    private static ApartamentoEstadoVendido instance = new ApartamentoEstadoVendido();

    public static ApartamentoEstadoVendido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Vendido";
    }

}



