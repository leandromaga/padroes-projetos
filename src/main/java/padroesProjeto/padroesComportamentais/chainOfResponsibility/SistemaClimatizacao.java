package padroesProjeto.padroesComportamentais.chainOfResponsibility;

public class SistemaClimatizacao extends Dispositivo {
    public SistemaClimatizacao() {
        listaEventos.add(TipoEventoTemperatura.getTipoEventoTemperatura());
    }

    public String getNomeDispositivo() {
        return "Sistema de Climatização";
    }
}
