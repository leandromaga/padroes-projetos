package padroesProjeto.padroesComportamentais.visitor;

public class Casa implements Imovel {


    private Double metragem;

    private String endereco;

    public Casa(Double metragem, String endereco) {
        this.metragem = metragem;
        this.endereco = endereco;
    }

    public Double getMetragem() {
        return metragem;
    }

    public String getEndereco() {
        return endereco;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCasa(this);
    }

}
