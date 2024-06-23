package padroesProjeto.padroesComportamentais.state;

public class ElevadorEstadoPortasFechadas extends ElevadorEstado {

    private ElevadorEstadoPortasFechadas() {
    }

    private static ElevadorEstadoPortasFechadas instance = new ElevadorEstadoPortasFechadas();

    public static ElevadorEstadoPortasFechadas getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Portas Fechadas";
    }

    public boolean abrirPortas(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoPortasAbertas.getInstance());
        return true;
    }

    public boolean subir(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        return true;
    }

    public boolean descer(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        return true;
    }
}
