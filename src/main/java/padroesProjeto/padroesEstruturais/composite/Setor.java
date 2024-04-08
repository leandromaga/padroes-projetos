package padroesProjeto.padroesEstruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Setor extends Armazem{

    private List<Armazem> armazens;

    public Setor(String descricao) {
        super(descricao);
        this.armazens = new ArrayList<Armazem>();
    }

    public void addArmazem(Armazem armazem) {
        this.armazens.add(armazem);
    }

    public String getArmazem() {
        String saida = "";
        saida = "Setor: " + this.getDescricao() + "\n";
        for (Armazem armazem : armazens) {
            saida += armazem.getArmazem();
        }
        return saida;
    }



}
