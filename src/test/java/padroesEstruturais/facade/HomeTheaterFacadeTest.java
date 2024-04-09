package padroesEstruturais.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import padroesProjeto.padroesEstruturais.facade.Amplificador;
import padroesProjeto.padroesEstruturais.facade.DVDPlayer;
import padroesProjeto.padroesEstruturais.facade.HomeTheaterFacade;
import padroesProjeto.padroesEstruturais.facade.Projetor;

public class HomeTheaterFacadeTest {

    @Test
    void testAssistirFilme() {
     
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        
        Amplificador amplificador = new Amplificador();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projetor projetor = new Projetor();

     
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplificador, dvdPlayer, projetor);

        homeTheater.assistirFilme("Matrix");

     
        String expectedOutput = "Iniciando sessão de filme...\n" +
                                "Amplificador ligado\n" +
                                "DVD Player ligado\n" +
                                "Projetor ligado\n" +
                                "Reproduzindo filme: Matrix\n";
        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out);


       
    }

    @Test
    void testPararFilme() {
     
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

      
        Amplificador amplificador = new Amplificador();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projetor projetor = new Projetor();

       
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplificador, dvdPlayer, projetor);

    
        homeTheater.pararFilme();

      
        String expectedOutput = "Encerrando sessão de filme...\n" +
                                "Amplificador desligado\n" +
                                "DVD Player desligado\n" +
                                "Projetor desligado\n";
        assertEquals(expectedOutput, outContent.toString());


        System.setOut(System.out);
    }
    
}
