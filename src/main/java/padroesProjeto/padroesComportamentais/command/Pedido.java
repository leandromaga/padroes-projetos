package padroesProjeto.padroesComportamentais.command;

public class Pedido {
    private final String descricao;
    private int quantidade;

    public Pedido(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void incrementarQuantidade(int quantidade) {
        this.quantidade = quantidade + 1;
    }

    public void decrementarQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade = quantidade -1;
        } else {
            this.quantidade = 0;
        }
    }
}
