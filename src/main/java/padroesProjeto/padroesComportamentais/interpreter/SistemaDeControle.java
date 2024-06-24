package padroesProjeto.padroesComportamentais.interpreter;

import java.util.HashMap;
import java.util.Map;

public class SistemaDeControle  {
    private Map<String, Integer> valores = new HashMap<>();

    public int getValor(String chave) {
        return valores.getOrDefault(chave, 0);
    }

    public void setValor(String chave, int valor) {
        valores.put(chave, valor);
    }

    public int getTemperatura() {
        return getValor("temperatura");
    }

    public void setTemperatura(int temperatura) {
        setValor("temperatura", temperatura);
    }

    public int getUmidade() {
        return getValor("umidade");
    }

    public void setUmidade(int umidade) {
        setValor("umidade", umidade);
    }
}