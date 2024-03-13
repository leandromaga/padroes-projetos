package padroesProjeto.prototype;

public class Registro implements Cloneable {
    private String proprietario;
    private Integer ano;

    public Registro(String proprietario, Integer ano) {
        this.proprietario = proprietario;
        this.ano = ano;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Registro{" +
                "proprietario='" + proprietario + '\'' +
                ", ano=" + ano +
                '}';
    }
}
