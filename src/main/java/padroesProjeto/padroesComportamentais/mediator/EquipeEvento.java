package padroesProjeto.padroesComportamentais.mediator;

public interface EquipeEvento {
    String prepararEvento(String mensagem);

    String desmontarEvento(String mensagem);
}