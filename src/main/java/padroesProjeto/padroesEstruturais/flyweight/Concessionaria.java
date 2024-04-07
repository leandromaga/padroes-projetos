package padroesProjeto.padroesEstruturais.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concessionaria {

    private List<Carro> carros = new ArrayList<>();

    public void cadastrar(String modelo, String marcaNome, String marcaPais) {
        Marca marca = MarcaFactory.getMarca(marcaNome, marcaPais);
        Carro carro = new Carro(modelo, marca);
        carros.add(carro);
    }

    public List<String> obterCarros() {
        List<String> saida = new ArrayList<String>();
        for (Carro carro : this.carros) {
            saida.add(carro.obterCarro());
        }
        return saida;
    }


}
