package padroesEstruturais.composite;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesEstruturais.composite.Loja;
import padroesProjeto.padroesEstruturais.composite.Produto;
import padroesProjeto.padroesEstruturais.composite.Setor;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LojaTest {

    @Test
    void deveRetornarOsArmazensDaLoja() {
        Setor setor1 = new Setor("Setor de produtos secos");

        Setor setor2 = new Setor("Setor de produtos refrigerados");
        Produto produto21 = new Produto("Leite", "Laticínio");
        setor2.addArmazem(produto21);

        Setor setor3 = new Setor("Setor de produtos congelados");
        Produto produto31 = new Produto("Sorvete", "Sobremesa");
        Produto produto32 = new Produto("Peixe", "Pescado");
        setor3.addArmazem(produto31);
        setor3.addArmazem(produto32);

        Setor setores = new Setor("Setores");
        setores.addArmazem(setor1);
        setores.addArmazem(setor2);
        setores.addArmazem(setor3);

        Loja loja = new Loja();
        loja.setEstoque(setores);

        assertEquals("Setor: Setores\n" +
                "Setor: Setor de produtos secos\n" +
                "Setor: Setor de produtos refrigerados\n" +
                "Produto: Leite - Tipo: Laticínio\n" +
                "Setor: Setor de produtos congelados\n" +
                "Produto: Sorvete - Tipo: Sobremesa\n" +
                "Produto: Peixe - Tipo: Pescado\n", loja.getEstoque());
    }


    @Test
    void deveRetornarExecacaoLojaSemEstoque() {
        try {
            Loja loja = new Loja();
            loja.getEstoque();
        } catch (NullPointerException e) {
            assertEquals("Loja sem produtos no estoque", e.getMessage());
        }
    }


}
