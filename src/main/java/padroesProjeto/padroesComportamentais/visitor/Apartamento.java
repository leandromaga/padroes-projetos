package padroesProjeto.padroesComportamentais.visitor;

public class Apartamento implements Imovel {

    private Double metragem;

    private String andar;

    public Apartamento(Double metragem, String andar) {
        this.metragem = metragem;
        this.andar = andar;
    }

    public Double getMetragem() {
        return metragem;
    }

    public String getAndar() {
        return andar;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirApartamento(this);
    }

}
