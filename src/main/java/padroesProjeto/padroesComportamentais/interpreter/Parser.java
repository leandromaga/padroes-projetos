package padroesProjeto.padroesComportamentais.interpreter;

public class Parser {
    public static void interpretar(String comando, Contexto contexto) {
        String[] parts = comando.trim().split(" ");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Comando inválido. Formato esperado: 'tipo +|-|= valor'.");
        }

        String tipo = parts[0];
        String operacao = parts[1];

        if (!operacao.matches("^[+-=]\\d+$")) {
            throw new IllegalArgumentException("Operação inválida. Deve ser '+', '-' ou '=' seguido por um número.");
        }

        switch (tipo.toLowerCase()) {
            case "temperatura":
                interpretarTemperatura(operacao, contexto);
                break;
            case "umidade":
                interpretarUmidade(operacao, contexto);
                break;
            default:
                throw new IllegalArgumentException("Tipo de comando desconhecido: " + tipo);
        }
    }

    private static void interpretarTemperatura(String operacao, Contexto contexto) {
        new TemperaturaExpressao(operacao).interpretar(contexto);
    }

    private static void interpretarUmidade(String operacao, Contexto contexto) {
        new UmidadeExpressao(operacao).interpretar(contexto);
    }
}