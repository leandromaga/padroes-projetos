package padroesProjeto.padroesComportamentais.command;

import java.util.Stack;

public class ControladorDeAcoes {
    private Stack<Command> commandStack = new Stack<>();
    private Stack<Command> undoStack = new Stack<>();

    public void executarComando(Command command) {
        command.execute();
        commandStack.push(command);
        undoStack.clear();
    }

    public void desfazerComando() {
        if (!commandStack.isEmpty()) {
            Command command = commandStack.pop();
            command.undo();
            undoStack.push(command);
        }
    }

    public void refazerComando() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.execute();
            commandStack.push(command);
        }
    }
}

