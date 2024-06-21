package padroesProjeto.padroesEstruturais.facade.exemploPassageiro;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentos {

    private List<Passageiro> passageirosComPendencia = new ArrayList<Passageiro>();

    public void addPassageiroComDocumentoFaltante(Passageiro passageiro) {
        this.passageirosComPendencia.add(passageiro);
    }

    public boolean verificarPassageiroComDocumentoFaltante(Passageiro passageiro) {
        return this.passageirosComPendencia.contains(passageiro);
    }




}
