package padroesProjeto.padroesComportamentais.state;

public abstract class ElevadorEstado {

    public abstract String getEstado();

    public boolean parar(Elevador elevador) {
        return false;
    }

    public boolean subir(Elevador elevador) {
        return false;
    }

    public boolean descer(Elevador elevador) {
        return false;
    }

    public boolean abrirPortas(Elevador elevador) {
        return false;
    }

    public boolean fecharPortas(Elevador elevador) {
        return false;
    }

}
