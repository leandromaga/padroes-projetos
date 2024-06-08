package padroesProjeto.padroesComportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {

    private ApartamentoEstado estado;

    private List<ApartamentoEstado> memento = new ArrayList<ApartamentoEstado>();

    public ApartamentoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ApartamentoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ApartamentoEstado> getEstados() {
        return this.memento;
    }





}
