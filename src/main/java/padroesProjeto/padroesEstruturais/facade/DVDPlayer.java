package padroesProjeto.padroesEstruturais.facade;

public class DVDPlayer {
    public void ligar() {
        System.out.println("DVD Player ligado");
    }

    public void desligar() {
        System.out.println("DVD Player desligado");
    }

    public void reproduzir(String filme) {
        System.out.println("Reproduzindo filme: " + filme);
    }
    
}
