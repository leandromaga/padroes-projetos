package padroesProjeto.padroesCriacao.prototype;

public class Carro implements Cloneable {
    private String marca;
    private String modelo;
    private Registro registro;

    public Carro(String marca, String modelo, Registro registro) {
        this.marca = marca;
        this.modelo = modelo;
        this.registro = registro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        Carro carroClone = (Carro) super.clone();
        carroClone.registro = (Registro) carroClone.registro.clone();
        return carroClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", registro=" + registro +
                '}';
    }
}