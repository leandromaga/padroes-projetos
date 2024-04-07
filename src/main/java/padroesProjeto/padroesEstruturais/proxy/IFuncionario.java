package padroesProjeto.padroesEstruturais.proxy;

import java.util.List;

public interface IFuncionario {

    List<String> obterDadosPessoais();

    List<Float> obterSalarios(Gerente gerente);

}
