package padroesProjeto.padroesComportamentais.interpreter;

public class InterpretadorComandos {
    public static void interpretar(String comando, SistemaDeControle sistemaDeControle) {
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
                interpretarTemperatura(operacao, sistemaDeControle);
                break;
            case "umidade":
                interpretarUmidade(operacao, sistemaDeControle);
                break;
            default:
                throw new IllegalArgumentException("Tipo de comando desconhecido: " + tipo);
        }
    }

    private static void interpretarTemperatura(String operacao, SistemaDeControle sistemaDeControle) {
        new TemperaturaExpressao(operacao).interpretar(sistemaDeControle);
    }

    private static void interpretarUmidade(String operacao, SistemaDeControle sistemaDeControle) {
        new UmidadeExpressao(operacao).interpretar(sistemaDeControle);
    }
}