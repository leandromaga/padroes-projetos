package padroesComportamentais.iterator;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.interator.Estoque;
import padroesProjeto.padroesComportamentais.interator.Produto;
import padroesProjeto.padroesComportamentais.interator.Sistema;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class estoqueTest {

    @Test
    public void deveContarProdutosEmFaltaEstoque() {
        Estoque estoque = new Estoque(
                new Produto("Arroz", true),
                new Produto("Feijão", false),
                new Produto("Macarrão", true),
                new Produto("Carne", false)
        );
        assertEquals(2, Sistema.contarProdutosEstoqueEmFalta(estoque));
    }

    @Test
    public void deveContarTotalProdutosEstoque() {
        Estoque estoque = new Estoque(
                new Produto("Arroz", true),
                new Produto("Feijão", false),
                new Produto("Macarrão", true),
                new Produto("Carne", false)
        );
        assertEquals(4, Sistema.contarTotalProdutosEstoque(estoque));
    }

}
