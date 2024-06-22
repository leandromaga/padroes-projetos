package padroesProjeto.padroesComportamentais.chainOfResponsibility;

public class TipoEventoTemperatura implements TipoEvento {
    private static TipoEventoTemperatura tipoEventoTemperatura = new TipoEventoTemperatura();
    private TipoEventoTemperatura() { }
    public static TipoEventoTemperatura getTipoEventoTemperatura() {
        return tipoEventoTemperatura;
    }
}
