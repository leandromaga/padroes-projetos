package padroesProjeto.padroesComportamentais.interator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Estoque implements Iterable<Produto> {

        private List<Produto> produtos = new ArrayList<Produto>();

        public Estoque(Produto... produtos) {
            this.setProdutos(Arrays.asList(produtos));
        }

        @Override
        public Iterator<Produto> iterator() {
            return getProdutos().iterator();
        }

        public List<Produto> getProdutos() {
            return produtos;
        }

        public void setProdutos(List<Produto> produtos) {
            this.produtos = produtos;
        }
}
