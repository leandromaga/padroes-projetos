package padroesProjeto.padroesComportamentais.interpreter;

public class UmidadeExpressao implements InterpretadorExpressao  {
    private final String operacao;
    private final int valor;

    public UmidadeExpressao(String operacao) {
        this.operacao = operacao.substring(0, 1);
        this.valor = Integer.parseInt(operacao.substring(1).trim());
    }

    @Override
    public void interpretar(SistemaDeControle sistemaDeControle) {
        int umidadeAtual = sistemaDeControle.getUmidade();
        switch (operacao) {
            case "+":
                sistemaDeControle.setUmidade(umidadeAtual + valor);
                break;
            case "-":
                sistemaDeControle.setUmidade(umidadeAtual - valor);
                break;
            case "=":
                sistemaDeControle.setUmidade(valor);
                break;
        }
        System.out.println("Umidade ajustada para: " + sistemaDeControle.getUmidade());
    }
}