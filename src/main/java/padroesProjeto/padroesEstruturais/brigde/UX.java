package padroesProjeto.padroesEstruturais.brigde;

public class UX extends Cargo{
    public UX(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (1 + this.experiencia.bonusFinalDeAno());
    }
    
}
