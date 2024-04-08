package padroesProjeto.padroesEstruturais.adapter;

public class AssinaturaBeneficios implements IAssinaturaTipo {
    private String beneficios;

    @Override
    public String getBeneficios() {
        return this.beneficios;
    }

    @Override
    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
