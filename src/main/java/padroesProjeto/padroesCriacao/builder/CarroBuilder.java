package padroesProjeto.padroesCriacao.builder;

public class CarroBuilder {

    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public Carro build() {
        if (carro.getMarca().equals("")) {
            throw new IllegalArgumentException("Marca inválida");
        }
        if (carro.getAno() == 0) {
            throw new IllegalArgumentException("Ano inválido");
        }
        return carro;
    }

    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setMarca(String marca) {
        carro.setMarca(marca);
        return this;
    }

    public CarroBuilder setAno(int ano) {
        carro.setAno(ano);
        return this;
    }

    public CarroBuilder setNumPortas(int numPortas) {
        carro.setNumPortas(numPortas);
        return this;
    }

    public CarroBuilder setCombustivel(String combustivel) {
        carro.setCombustivel(combustivel);
        return this;
    }

    public CarroBuilder setCambio(String cambio) {
        carro.setCambio(cambio);
        return this;
    }

    public CarroBuilder setCor(String cor) {
        carro.setCor(cor);
        return this;
    }

    public CarroBuilder setDirecao(String direcao) {
        carro.setDirecao(direcao);
        return this;
    }




}
