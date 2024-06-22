package padroesProjeto.padroesComportamentais.chainOfResponsibility;

public class TipoEventoLuz implements TipoEvento {
    private static TipoEventoLuz tipoEventoLuz = new TipoEventoLuz();
    private TipoEventoLuz() { }
    public static TipoEventoLuz getTipoEventoLuz() {
        return tipoEventoLuz;
    }
}
