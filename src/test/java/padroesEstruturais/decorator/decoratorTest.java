package padroesEstruturais.decorator;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesEstruturais.decorator.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class decoratorTest {

    @Test
    void deveRetornarPrecoTotalNotebookSimples() {
        Notebook notebook = new NotebookSimples(1000);
        assertEquals(1000, notebook.getPrecoTotal());
    }

    @Test
    void deveRetornarNotebookComUpgradeHd() {
        Notebook notebook = new Hd(new NotebookSimples(1000));

        assertEquals(1500, notebook.getPrecoTotal());
    }

    @Test
    void deveRetornarNotabookComUpgradeRam() {
        Notebook notebook = new Ram(new NotebookSimples(1000));

        assertEquals(1300, notebook.getPrecoTotal());
    }

    @Test
    void deveRetornarNotebookComUpgradePlacaVideo() {
        Notebook notebook = new PlacaVideo(new NotebookSimples(1000));

        assertEquals(2000, notebook.getPrecoTotal());
    }

    @Test
    void deveRetornarNotebookComUpgradeHdRam() {
        Notebook notebook = new Hd(new Ram(new NotebookSimples(1000)));

        assertEquals(1800, notebook.getPrecoTotal());
    }

    @Test
    void deveRetornarNotebookComUpgradeHdPlacaVideo() {
        Notebook notebook = new Hd(new PlacaVideo(new NotebookSimples(1000)));

        assertEquals(2500, notebook.getPrecoTotal());
    }

    @Test
    void deveRetornarNotebookComUpgradeRamPlacaVideo() {
        Notebook notebook = new Ram(new PlacaVideo(new NotebookSimples(1000)));

        assertEquals(2300, notebook.getPrecoTotal());
    }

    @Test
    void deveRetornarNotebookComUpgradeHdRamPlacaVideo() {
        Notebook notebook = new Hd(new Ram(new PlacaVideo(new NotebookSimples(1000))));

        assertEquals(2800, notebook.getPrecoTotal());
    }

    @Test
    void deveRetornarUpgradeNotebookSimples() {
        Notebook notebook = new NotebookSimples();
        assertEquals("Notebook simples", notebook.getUpgrade());
    }

    @Test
    void deveRetornarUpgradeNotebookComHd() {
        Notebook notebook = new Hd(new NotebookSimples());
        assertEquals("Notebook simples/HD", notebook.getUpgrade());
    }

    @Test
    void deveRetornarUpgradeNotebookComRam() {
        Notebook notebook = new Ram(new NotebookSimples());
        assertEquals("Notebook simples/Memória RAM", notebook.getUpgrade());
    }

    @Test
    void deveRetornarUpgradeNotebookComPlacaVideo() {
        Notebook notebook = new PlacaVideo(new NotebookSimples());
        assertEquals("Notebook simples/Placa de vídeo", notebook.getUpgrade());
    }

    @Test
    void deveRetornarUpgradeNotebookComHdRam() {
        Notebook notebook = new Hd(new Ram(new NotebookSimples()));
        assertEquals("Notebook simples/Memória RAM/HD", notebook.getUpgrade());
    }

    @Test
    void deveRetornarUpgradeNotebookComHdPlacaVideo() {
        Notebook notebook = new Hd(new PlacaVideo(new NotebookSimples()));
        assertEquals("Notebook simples/Placa de vídeo/HD", notebook.getUpgrade());
    }

    @Test
    void deveRetornarUpgradeNotebookComRamPlacaVideo() {
        Notebook notebook = new Ram(new PlacaVideo(new NotebookSimples()));
        assertEquals("Notebook simples/Placa de vídeo/Memória RAM", notebook.getUpgrade());
    }

    @Test
    void deveRetornarUpgradeNotebookComHdRamPlacaVideo() {
        Notebook notebook = new Hd(new Ram(new PlacaVideo(new NotebookSimples())));
        assertEquals("Notebook simples/Placa de vídeo/Memória RAM/HD", notebook.getUpgrade());
    }

}
