package padroesComportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.state.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ElevadorTest {

    Elevador elevador;

    @BeforeEach
    public void setup() {
        elevador = new Elevador();
    }

    @Test
    public void naoDevePararElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        assertFalse(elevador.parar());
    }

    @Test
    public void deveFecharPortasElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        elevador.fecharPortas();
        assertEquals(ElevadorEstadoPortasFechadas.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveAbrirPortasElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        elevador.abrirPortas();
        assertEquals(ElevadorEstadoPortasAbertas.getInstance(), elevador.getEstado());
    }

    @Test
    public void naoDeveAbrirPortasElevadorPortasAbertas() {
        elevador.setEstado(ElevadorEstadoPortasAbertas.getInstance());
        assertFalse(elevador.abrirPortas());
    }

    @Test
    public void deveFecharPortasElevadorPortasAbertas() {
        elevador.setEstado(ElevadorEstadoPortasAbertas.getInstance());
        elevador.fecharPortas();
        assertEquals(ElevadorEstadoPortasFechadas.getInstance(), elevador.getEstado());
    }

    @Test
    public void naoDeveFecharPortasElevadorPortasFechadas() {
        elevador.setEstado(ElevadorEstadoPortasFechadas.getInstance());
        assertFalse(elevador.fecharPortas());
    }

    @Test
    public void deveAbrirPortasElevadorPortasFechadas() {
        elevador.setEstado(ElevadorEstadoPortasFechadas.getInstance());
        elevador.abrirPortas();
        assertEquals(ElevadorEstadoPortasAbertas.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveSubirElevadorPortasFechadas() {
        elevador.setEstado(ElevadorEstadoPortasFechadas.getInstance());
        elevador.subir();
        assertEquals(ElevadorEstadoSubindo.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveDescerElevadorPortasFechadas() {
        elevador.setEstado(ElevadorEstadoPortasFechadas.getInstance());
        elevador.descer();
        assertEquals(ElevadorEstadoDescendo.getInstance(), elevador.getEstado());
    }

    @Test
    public void naoDeveSubirElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertFalse(elevador.subir());
    }

    @Test
    public void devePararElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        elevador.parar();
        assertEquals(ElevadorEstadoParado.getInstance(), elevador.getEstado());
    }

    @Test
    public void naoDeveDescerElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertFalse(elevador.descer());
    }

    @Test
    public void devePararElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        elevador.parar();
        assertEquals(ElevadorEstadoParado.getInstance(), elevador.getEstado());
    }

    @Test
    public void naoDeveSubirElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        assertFalse(elevador.subir());
    }

    @Test
    public void naoDeveDescerElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        assertFalse(elevador.descer());
    }

    @Test
    public void naoDeveFecharPortasElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertFalse(elevador.fecharPortas());
    }

    @Test
    public void naoDeveAbrirPortasElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertFalse(elevador.abrirPortas());
    }

    @Test
    public void naoDeveDescerElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertFalse(elevador.descer());
    }

    @Test
    public void naoDeveFecharPortasElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertFalse(elevador.fecharPortas());
    }

    @Test
    public void naoDeveAbrirPortasElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertFalse(elevador.abrirPortas());
    }

    @Test
    public void naoDeveSubirElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertFalse(elevador.subir());
    }

    @Test
    public void naoDevePararElevadorPortasAbertas() {
        elevador.setEstado(ElevadorEstadoPortasAbertas.getInstance());
        assertFalse(elevador.parar());
    }

    @Test
    public void naoDeveSubirElevadorPortasAbertas() {
        elevador.setEstado(ElevadorEstadoPortasAbertas.getInstance());
        assertFalse(elevador.subir());
    }

    @Test
    public void naoDeveDescerElevadorPortasAbertas() {
        elevador.setEstado(ElevadorEstadoPortasAbertas.getInstance());
        assertFalse(elevador.descer());
    }

    @Test
    public void naoDevePararElevadorPortasFechadas() {
        elevador.setEstado(ElevadorEstadoPortasFechadas.getInstance());
        assertFalse(elevador.parar());
    }




}
