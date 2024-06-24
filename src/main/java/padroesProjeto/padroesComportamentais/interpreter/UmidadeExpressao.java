package padroesProjeto.padroesComportamentais.interpreter;

public class UmidadeExpressao implements Expressao {
    private final String operacao;
    private final int valor;

    public UmidadeExpressao(String operacao) {
        this.operacao = operacao.substring(0, 1);
        this.valor = Integer.parseInt(operacao.substring(1).trim());
    }

    @Override
    public void interpretar(Contexto contexto) {
        int umidadeAtual = contexto.getUmidade();
        switch (operacao) {
            case "+":
                contexto.setUmidade(umidadeAtual + valor);
                break;
            case "-":
                contexto.setUmidade(umidadeAtual - valor);
                break;
            case "=":
                contexto.setUmidade(valor);
                break;
        }
        System.out.println("Umidade ajustada para: " + contexto.getUmidade());
    }
}