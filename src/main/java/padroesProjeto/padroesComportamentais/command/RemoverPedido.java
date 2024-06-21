package padroesProjeto.padroesComportamentais.command;

public class RemoverPedido implements Command {
    private final GerenciadorPedidos gerenciador;
    private final Pedido pedido;

    public RemoverPedido(GerenciadorPedidos gerenciador, Pedido pedido) {
        this.gerenciador = gerenciador;
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        gerenciador.removerPedido(pedido);
    }

    @Override
    public void desfazer() {
        gerenciador.adicionarPedido(pedido);
    }
}
