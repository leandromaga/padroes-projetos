package padroesProjeto.padroesComportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {


    private final List<Observer> observadores;

    private String statusTask;

    public Task() {
        observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(statusTask);
        }
    }

    public void setStatusTask(String statusTask) {
        this.statusTask = statusTask;
        notificarObservadores();
    }



}
