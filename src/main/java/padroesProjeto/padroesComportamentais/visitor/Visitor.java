package padroesProjeto.padroesComportamentais.visitor;

public interface Visitor {

    String exibirCasa(Casa casa);

    String exibirApartamento(Apartamento apartamento);

    String exibirSalaComercial(SalaComercial salaComercial);

}
