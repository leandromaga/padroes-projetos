package padroesProjeto.padroesEstruturais.brigde;

public class AnalistaDados extends Cargo {
    public AnalistaDados(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return  this.salarioBase * (1 + this.experiencia.bonusFinalDeAno());
    }
}
