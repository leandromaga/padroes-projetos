package padroesProjeto.padroesEstruturais.adapter;

public class Usuario {
    private AssinaturaAdapter adaptador;

    public Usuario() {
        AssinaturaBeneficios beneficios = new AssinaturaBeneficios();
        adaptador = new AssinaturaAdapter(beneficios);
    }

    public void setAssinatura(String tipo) {
        adaptador.setTipoAssinatura(tipo);
    }

    public String getAssinatura() {
        return adaptador.getTipoAssinatura();
    }

    public String getBeneficios() {
        return adaptador.getTipoAssinatura();
    }
}
