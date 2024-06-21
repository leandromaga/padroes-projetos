package padroesProjeto.padroesComportamentais.templatemethod;

public class Guache implements Tinta {

    @Override
    public void adicionarComponenteBase() {
        System.out.println("Adicionando água...");
    }

    @Override
    public void adicionarPigmento() {
        System.out.println("Adicionando corante...");
    }

}
