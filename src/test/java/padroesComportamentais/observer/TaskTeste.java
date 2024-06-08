package padroesComportamentais.observer;

import org.junit.jupiter.api.Test;
import padroesProjeto.padroesComportamentais.observer.Desenvolvedor;
import padroesProjeto.padroesComportamentais.observer.Task;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaskTeste {

    @Test
    public void testarObserver() {
        Task task = new Task();
        Desenvolvedor desenvolvedor1 = new Desenvolvedor();
        desenvolvedor1.setNome("Desenvolvedor 1");
        Desenvolvedor desenvolvedor2 = new Desenvolvedor();
        desenvolvedor2.setNome("Desenvolvedor 2");

        task.adicionarObservador(desenvolvedor1);
        task.adicionarObservador(desenvolvedor2);

        task.setStatusTask("Em andamento");
        task.setStatusTask("Homologação");

        task.removerObservador(desenvolvedor1);
        task.setStatusTask("Concluído");

        assertNotNull(task);

    }

}
