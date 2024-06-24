package padroesProjeto.padroesComportamentais.interpreter;

public class TemperaturaExpressao implements Expressao {
    private final String operacao;
    private final int valor;

    public TemperaturaExpressao(String operacao) {
        this.operacao = operacao.substring(0, 1);
        this.valor = Integer.parseInt(operacao.substring(1).trim());
    }

    @Override
    public void interpretar(Contexto contexto) {
        int temperaturaAtual = contexto.getTemperatura();
        switch (operacao) {
            case "+":
                contexto.setTemperatura(temperaturaAtual + valor);
                break;
            case "-":
                contexto.setTemperatura(temperaturaAtual - valor);
                break;
            case "=":
                contexto.setTemperatura(valor);
                break;
        }
        System.out.println("Temperatura ajustada para: " + contexto.getTemperatura());
    }
}
