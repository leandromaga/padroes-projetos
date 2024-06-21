package padroesProjeto.padroesComportamentais.templatemethod;

public interface Tinta {

    public default void produzirTinta() {
        adicionarComponenteBase();
        adicionarPigmento();
        misturarComponentes();
        embalar();
    }

    public void adicionarComponenteBase();

    public void adicionarPigmento();

    private void misturarComponentes() {
        System.out.println("Misturando componentes...");
    };

    private void embalar() {
        System.out.println("Embalando tinta...");
    };


}
