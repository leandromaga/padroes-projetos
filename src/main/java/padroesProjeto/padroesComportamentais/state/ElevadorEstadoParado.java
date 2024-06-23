package padroesProjeto.padroesComportamentais.state;

public class ElevadorEstadoParado extends ElevadorEstado {

    private ElevadorEstadoParado() {
    }

    private static ElevadorEstadoParado instance = new ElevadorEstadoParado();

    public static ElevadorEstadoParado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Parado";
    }

    public boolean fecharPortas(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoPortasFechadas.getInstance());
        return true;
    }

    public boolean abrirPortas(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoPortasAbertas.getInstance());
        return false;
    }

}
