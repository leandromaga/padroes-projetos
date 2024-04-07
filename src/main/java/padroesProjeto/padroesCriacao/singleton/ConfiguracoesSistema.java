package padroesProjeto.padroesCriacao.singleton;

public class ConfiguracoesSistema {

    private static ConfiguracoesSistema instance;

    private String idioma;
    private String regiao;

    private ConfiguracoesSistema() {

        idioma = "Português";
        regiao = "Brasil";
    }

    public static ConfiguracoesSistema getInstance() {
        if (instance == null) {
            instance = new ConfiguracoesSistema();
        }
        return instance;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getRegiao() {
        return regiao;
    }

    @Override
    public String toString() {
        return "Idioma: " + getIdioma() + ", Região: " + getRegiao() + ", Hash: " + super.toString();
    }
}