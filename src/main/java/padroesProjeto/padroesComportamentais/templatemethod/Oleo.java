package padroesProjeto.padroesComportamentais.templatemethod;

public class Oleo implements Tinta {

        @Override
        public void adicionarComponenteBase() {
            System.out.println("Adicionando óleo de linhaça...");
        }

        @Override
        public void adicionarPigmento() {
            System.out.println("Adicionando pigmento...");
        }
}
