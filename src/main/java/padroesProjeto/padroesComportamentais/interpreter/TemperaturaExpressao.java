package padroesProjeto.padroesComportamentais.interpreter;

public class TemperaturaExpressao implements InterpretadorExpressao  {
    private final String operacao;
    private final int valor;

    public TemperaturaExpressao(String operacao) {
        this.operacao = operacao.substring(0, 1);
        this.valor = Integer.parseInt(operacao.substring(1).trim());
    }

    @Override
    public void interpretar(SistemaDeControle  sistemaDeControle) {
        int temperaturaAtual = sistemaDeControle.getTemperatura();
        switch (operacao) {
            case "+":
                sistemaDeControle.setTemperatura(temperaturaAtual + valor);
                break;
            case "-":
                sistemaDeControle.setTemperatura(temperaturaAtual - valor);
                break;
            case "=":
                sistemaDeControle.setTemperatura(valor);
                break;
        }
        System.out.println("Temperatura ajustada para: " + sistemaDeControle.getTemperatura());
    }
}
