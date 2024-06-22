package padroesProjeto.padroesComportamentais.chainOfResponsibility;


import java.util.ArrayList;

public abstract class Dispositivo {
    protected ArrayList<TipoEvento> listaEventos = new ArrayList<>();
    private Dispositivo dispositivoSuperior;

    public Dispositivo getDispositivoSuperior() {
        return dispositivoSuperior;
    }

    public void setDispositivoSuperior(Dispositivo dispositivoSuperior) {
        this.dispositivoSuperior = dispositivoSuperior;
    }

    public abstract String getNomeDispositivo();

    public String processarEvento(Evento evento) {
        if (listaEventos.contains(evento.getTipoEvento())) {
            return getNomeDispositivo() + " processou " + evento.getDescricao();
        } else {
            if (dispositivoSuperior != null) {
                return dispositivoSuperior.processarEvento(evento);
            } else {
                return "Evento não processado";
            }
        }
    }
}