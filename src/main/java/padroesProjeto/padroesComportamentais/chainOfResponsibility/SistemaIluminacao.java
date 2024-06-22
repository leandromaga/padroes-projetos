package padroesProjeto.padroesComportamentais.chainOfResponsibility;

public class SistemaIluminacao  extends Dispositivo {
    public SistemaIluminacao(Dispositivo superior) {
        listaEventos.add(TipoEventoLuz.getTipoEventoLuz());
        setDispositivoSuperior(superior);
    }

    public String getNomeDispositivo() {
        return "Sistema de Iluminação";
    }
}
