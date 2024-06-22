package padroesProjeto.padroesComportamentais.mediator;

public class Participante {

    public String iniciarParticipacao(String mensagem) {
        return CoordenadorEventos.getInstancia().coordenarInicio(mensagem);
    }

    public String encerrarParticipacao(String mensagem) {
        return CoordenadorEventos.getInstancia().coordenarEncerramento(mensagem);
    }
}
