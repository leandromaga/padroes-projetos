package padroesProjeto.padroesComportamentais.chainOfResponsibility;

public class SistemaSom extends Dispositivo {
    public SistemaSom(Dispositivo superior) {
        listaEventos.add(TipoEventoSom.getTipoEventoSom());
        setDispositivoSuperior(superior);
    }

    public String getNomeDispositivo() {
        return "Sistema de Som";
    }
}
