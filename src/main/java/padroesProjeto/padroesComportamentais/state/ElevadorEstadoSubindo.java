package padroesProjeto.padroesComportamentais.state;

public class ElevadorEstadoSubindo extends ElevadorEstado {

    private ElevadorEstadoSubindo() {
    }

    private static ElevadorEstadoSubindo instance = new ElevadorEstadoSubindo();

    public static ElevadorEstadoSubindo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Subindo";
    }

    public boolean parar(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        return true;
    }

}
