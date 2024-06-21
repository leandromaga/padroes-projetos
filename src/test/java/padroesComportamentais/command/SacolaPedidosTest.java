package padroesComportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.command.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SacolaPedidosTest {

    private GerenciadorPedidos gerenciador;

    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorPedidos();
    }

    @Test
    public void testAdicionarEremoverPedidos() {
        Pedido pizza = new Pedido("Pizza de Calabresa", 1);
        Pedido refrigerante = new Pedido("Refrigerante", 2);

        AdicionarPedido adicionarPizza = new AdicionarPedido(gerenciador, pizza);
        AdicionarPedido adicionarRefrigerante = new AdicionarPedido(gerenciador, refrigerante);

        adicionarPizza.executar();
        adicionarRefrigerante.executar();

        List<Pedido> pedidos = gerenciador.getPedidos();
        assertEquals(2, pedidos.size());

        Pedido pedidoPizza = gerenciador.encontrarPedido("Pizza de Calabresa");
        assertEquals(1, pedidoPizza.getQuantidade());

        Pedido pedidoRefrigerante = gerenciador.encontrarPedido("Refrigerante");
        assertEquals(2, pedidoRefrigerante.getQuantidade());

        RemoverPedido removerRefrigerante = new RemoverPedido(gerenciador, refrigerante);
        removerRefrigerante.executar();
        assertEquals(1, pedidoRefrigerante.getQuantidade());

        removerRefrigerante.executar();

        assertNull(gerenciador.encontrarPedido("Refrigerante"));

        AdicionarPedido addPedido = new AdicionarPedido(gerenciador, refrigerante);
        addPedido.executar();
        addPedido.executar();
        AdicionarPedido addPedido2 = new AdicionarPedido(gerenciador, pizza);
        addPedido2.executar();

        assertEquals(2, pedidoRefrigerante.getQuantidade());
        assertEquals(2, pedidoPizza.getQuantidade());
    }

    @Test
    public void testDesfazerPedidos() {
        Pedido pedido1 = new Pedido("Pizza de Calabresa", 1);
        Pedido pedido2 = new Pedido("Refrigerante", 2);

        gerenciador.desfazer();

        Command adicionarPedido1 = new AdicionarPedido(gerenciador, pedido1);
        Command adicionarPedido2 = new AdicionarPedido(gerenciador, pedido2);

        adicionarPedido1.executar();
        adicionarPedido2.executar();

        assertEquals(2, gerenciador.getPedidos().size());
        assertEquals(1, gerenciador.encontrarPedido("Pizza de Calabresa").getQuantidade());
        assertEquals(2, gerenciador.encontrarPedido("Refrigerante").getQuantidade());

        gerenciador.desfazer();

        assertEquals(2, gerenciador.getPedidos().size());

        gerenciador.desfazer();

        assertEquals(2, gerenciador.getPedidos().size());

        RemoverPedido removerRefrigerante = new RemoverPedido(gerenciador, pedido2);
        removerRefrigerante.executar();
        removerRefrigerante.executar();

        assertEquals(1, gerenciador.getPedidos().size());
        assertNull(gerenciador.encontrarPedido("Refrigerante"));
        assertEquals(1, gerenciador.encontrarPedido("Pizza de Calabresa").getQuantidade());

        gerenciador.desfazer();
        assertEquals(2, gerenciador.getPedidos().size());

        AdicionarPedido addPedido = new AdicionarPedido(gerenciador, pedido2);
        addPedido.executar();
        addPedido.executar();
        addPedido.executar();

        assertEquals(2, gerenciador.getPedidos().size());

    }
}
