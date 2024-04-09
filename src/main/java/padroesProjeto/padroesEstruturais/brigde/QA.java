package padroesProjeto.padroesEstruturais.brigde;

public class QA extends Cargo {
    public QA(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (1 + this.experiencia.bonusFinalDeAno());
    }
}
