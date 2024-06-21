package padroesProjeto.padroesComportamentais.command;

public class AdicionarPedido implements Command {
    private final GerenciadorPedidos gerenciador;
    private final Pedido pedido;

    public AdicionarPedido(GerenciadorPedidos gerenciador, Pedido pedido) {
        this.gerenciador = gerenciador;
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        gerenciador.adicionarPedido(pedido);
    }

    @Override
    public void desfazer() {
        gerenciador.removerPedido(pedido);
    }
}
