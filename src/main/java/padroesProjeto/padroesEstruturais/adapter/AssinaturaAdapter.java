package padroesProjeto.padroesEstruturais.adapter;

public class AssinaturaAdapter implements IAssinatura {
    private IAssinaturaTipo assinaturaTipo;

    public AssinaturaAdapter(IAssinaturaTipo assinaturaTipo) {
        this.assinaturaTipo = assinaturaTipo;
    }

    @Override
    public String getTipoAssinatura() {
        return assinaturaTipo.getBeneficios();
    }

    @Override
    public void setTipoAssinatura(String tipo) {
        assinaturaTipo.setBeneficios(tipo);
    }
}
