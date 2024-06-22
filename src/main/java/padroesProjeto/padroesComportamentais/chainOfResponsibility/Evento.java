package padroesProjeto.padroesComportamentais.chainOfResponsibility;

public class Evento {
    private TipoEvento tipoEvento;
    private String descricao;

    public Evento(TipoEvento tipoEvento, String descricao) {
        this.tipoEvento = tipoEvento;
        this.descricao = descricao;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public String getDescricao() {
        return descricao;
    }
}