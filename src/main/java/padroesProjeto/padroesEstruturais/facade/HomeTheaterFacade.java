package padroesProjeto.padroesEstruturais.facade;

public class HomeTheaterFacade {
    private Amplificador amplificador;
    private DVDPlayer dvdPlayer;
    private Projetor projetor;

    public HomeTheaterFacade(Amplificador amplificador, DVDPlayer dvdPlayer, Projetor projetor) {
        this.amplificador = amplificador;
        this.dvdPlayer = dvdPlayer;
        this.projetor = projetor;
    }

    public void assistirFilme(String filme) {
        System.out.println("Iniciando sessão de filme...");
        amplificador.ligar();
        dvdPlayer.ligar();
        projetor.ligar();
        dvdPlayer.reproduzir(filme);
    }

    public void pararFilme() {
        System.out.println("Encerrando sessão de filme...");
        amplificador.desligar();
        dvdPlayer.desligar();
        projetor.desligar();
    }
    
}
