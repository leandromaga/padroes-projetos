package padroesProjeto.padroesEstruturais.brigde;

public class Desenvolvedor extends Cargo {
    public Desenvolvedor(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (1 + this.experiencia.bonusFinalDeAno());
    }
}
