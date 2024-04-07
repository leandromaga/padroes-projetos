package padroesProjeto.padroesEstruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarcaFactory {

    private static Map<String, Marca> marcas = new HashMap<>();


    public static Marca getMarca(String nome, String pais) {
        Marca marca = marcas.get(nome);
        if (marca == null) {
            marca = new Marca(nome, pais);
            marcas.put(nome, marca);
        }
        return marca;
    }

    public static int getTotalMarcas() {
        return marcas.size();
    }

}
