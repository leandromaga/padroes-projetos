package padroesProjeto.padroesComportamentais.state;

public class ElevadorEstadoPortasAbertas extends ElevadorEstado {

    private ElevadorEstadoPortasAbertas() {
    }

    private static ElevadorEstadoPortasAbertas instance = new ElevadorEstadoPortasAbertas();

    public static ElevadorEstadoPortasAbertas getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Portas Abertas";
    }

    public boolean fecharPortas(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoPortasFechadas.getInstance());
        return true;
    }

}
