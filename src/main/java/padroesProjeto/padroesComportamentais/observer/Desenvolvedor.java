package padroesProjeto.padroesComportamentais.observer;

public class Desenvolvedor implements Observer {

    private String statusTask;

    private String nome;

    @Override
    public void atualizar(String statusTask) {
        this.statusTask = statusTask;
        exibir();
    }

    public void exibir() {
        System.out.println("Status atual da Task: " + this.nome + " :" + statusTask);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
