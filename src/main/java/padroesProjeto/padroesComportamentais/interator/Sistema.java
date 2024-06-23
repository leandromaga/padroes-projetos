package padroesProjeto.padroesComportamentais.interator;

import java.util.Iterator;

public class Sistema {

    public static Integer contarProdutosEstoqueEmFalta(Estoque estoque) {
        int count = 0;

        for (Produto produto: estoque.getProdutos()) {
            if (produto.isEmFalta()) {
                count++;
            }
            System.out.println(produto.getNome());
        }

        count = 0;
        for (Produto produto : estoque) {
            if (produto.isEmFalta()) {
                count++;
            }
        }
        return count;
    }

    public static Integer contarTotalProdutosEstoque(Estoque estoque) {
        int count = 0;
        for (Iterator a = estoque.iterator(); a.hasNext(); ) {
            count++;
            a.next();
        }
        return count;
    }

}
