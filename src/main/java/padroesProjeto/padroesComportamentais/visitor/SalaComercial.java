package padroesProjeto.padroesComportamentais.visitor;

public class SalaComercial implements Imovel {

    private Double metragem;

    private String bairro;

    public SalaComercial(Double metragem, String bairro) {
        this.metragem = metragem;
        this.bairro = bairro;
    }

    public Double getMetragem() {
        return metragem;
    }

    public String getBairro() {
        return bairro;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSalaComercial(this);
    }
}
