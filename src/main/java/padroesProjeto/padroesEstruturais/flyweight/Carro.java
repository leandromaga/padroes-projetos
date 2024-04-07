package padroesProjeto.padroesEstruturais.flyweight;

public class Carro {

    private String modelo;

    private Marca marca;

    public Carro(String modelo, Marca marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String obterCarro() {
        return "Carro{" +
                "modelo='" + this.modelo + '\'' +
                ", marca='" + marca.getNome() + '\'' +
                ", pais='" + marca.getPais() + '\'' +
                '}';
    }



}
