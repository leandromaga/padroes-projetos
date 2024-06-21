package padroesProjeto.padroesComportamentais.command;

import java.util.*;

public class GerenciadorPedidos {
    private final Map<String, Pedido> pedidos = new HashMap<>();
    private final Stack<Command> historico = new Stack<>();

    public void adicionarPedido(Pedido pedido) {
        if(pedido.getQuantidade() == 0){
            pedido.setQuantidade(1);
        }
        Pedido pedidoExistente = pedidos.get(pedido.getDescricao());
        if (pedidoExistente != null) {
            pedidoExistente.incrementarQuantidade(pedido.getQuantidade());
        } else {
            pedidos.put(pedido.getDescricao(), pedido);
        }
        historico.push(new AdicionarPedido(this, pedido));
        System.out.println("Pedido adicionado: " + pedido.getDescricao() + ", Quantidade: " + pedido.getQuantidade());
    }

    public void removerPedido(Pedido pedido) {
        Pedido pedidoExistente = pedidos.get(pedido.getDescricao());
        if (pedidoExistente != null) {
            pedidoExistente.decrementarQuantidade(pedido.getQuantidade());
            if (pedidoExistente.getQuantidade() <= 0) {
                pedidos.remove(pedido.getDescricao());
                System.out.println("Pedido removido: " + pedido.getDescricao());
            }
            else{
                historico.push(new RemoverPedido(this, pedido));
                System.out.println("Pedido removido: " + pedido.getDescricao() + ", Quantidade: " + pedido.getQuantidade());
            }
        } else {
            System.out.println("Pedido não encontrado para remover: " + pedido.getDescricao());
        }
    }

    public void desfazer() {
        if (!historico.isEmpty()) {
            Command ultimaAcao = historico.pop();
            System.out.println("Desfazer pressionado");
            ultimaAcao.desfazer();
            System.out.println("Última ação desfeita.");
        } else {
            System.out.println("Nenhuma ação para desfazer.");
        }
    }

    public List<Pedido> getPedidos() {
        return new ArrayList<>(pedidos.values());
    }

    public Pedido encontrarPedido(String descricao) {
        return pedidos.get(descricao);
    }
}
