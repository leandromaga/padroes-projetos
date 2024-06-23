package padroesProjeto.padroesComportamentais.visitor;

public class ImovelVisitor implements Visitor {

    @Override
    public String exibirCasa(Casa casa) {
    return "Casa{metragem=" + casa.getMetragem() + ", endereco='" + casa.getEndereco() + "'}";
    }

    @Override
    public String exibirApartamento(Apartamento apartamento) {
        return "Apartamento{metragem=" + apartamento.getMetragem() + ", andar='" + apartamento.getAndar() + "'}";
    }

    @Override
    public String exibirSalaComercial(SalaComercial salaComercial) {
        return "Sala Comercial{metragem=" + salaComercial.getMetragem() + ", bairro='" + salaComercial.getBairro() + "'}";
    }

}
