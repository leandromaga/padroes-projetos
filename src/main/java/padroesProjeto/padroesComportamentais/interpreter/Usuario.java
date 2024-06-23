package padroesProjeto.padroesComportamentais.interpreter;

public class Usuario {

    private double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double converterNumero() {
        return Sistema.converterNumero(this.numero);
    }


}
