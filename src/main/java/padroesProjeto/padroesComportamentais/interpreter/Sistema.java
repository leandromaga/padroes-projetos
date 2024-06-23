package padroesProjeto.padroesComportamentais.interpreter;

public class Sistema {

    public static String input = "numero Km em cm";

    public static double converterNumero(double numero) {
        String unidadeMedida;
        unidadeMedida = input.replace("numero", Double.toString(numero));
//        InterpretadorUnidadeMedida interpretador = new InterpretadorUnidadeMedida(unidadeMedida);
//        return interpretador.interpretar();
        return 0;
    }

}
