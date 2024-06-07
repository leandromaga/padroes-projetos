package padroesProjeto.padroesEstruturais.brigde;

public abstract class Cargo {
    protected IExperiencia experiencia;
    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setExperiencia(IExperiencia experiencia) {
        this.experiencia = experiencia;
    }

//    public void setSalarioBase(float salarioBase) {
//        this.salarioBase = salarioBase;
//    }

    public abstract float calcularSalario();
}
