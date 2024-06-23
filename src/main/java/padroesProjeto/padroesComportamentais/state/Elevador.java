package padroesProjeto.padroesComportamentais.state;

public class Elevador {

    private String andar;

    private ElevadorEstado estado;

    public Elevador() {
        this.estado = ElevadorEstadoParado.getInstance();
    }

    public void setEstado(ElevadorEstado estado) {
        this.estado = estado;
    }

    public boolean parar() {
        System.out.println("Parando...");
        return estado.parar(this);
    }

    public boolean abrirPortas() {
        System.out.println("Abrindo portas...");
        return estado.abrirPortas(this);
    }

    public boolean fecharPortas() {
        System.out.println("Fechando portas...");
        return estado.fecharPortas(this);
    }

    public boolean subir() {
        System.out.println("Subindo...");
        return estado.subir(this);
    }

    public boolean descer() {
        System.out.println("Descendo...");
        return estado.descer(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public ElevadorEstado getEstado() {
        return estado;
    }

}
