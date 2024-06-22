package padroesProjeto.padroesComportamentais.chainOfResponsibility;

public class TipoEventoSom  implements TipoEvento {
    private static TipoEventoSom tipoEventoSom = new TipoEventoSom();
    private TipoEventoSom() { }
    public static TipoEventoSom getTipoEventoSom() {
        return tipoEventoSom;
    }
}
