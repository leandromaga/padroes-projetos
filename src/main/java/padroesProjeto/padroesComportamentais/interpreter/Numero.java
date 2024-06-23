package padroesProjeto.padroesComportamentais.interpreter;

public class Numero implements InterpretadorMedida {

    private double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    public double interpretrar() {
        return numero;
    }

    public double getNumero() {
        return this.numero;
    }

}
