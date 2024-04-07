package padroesProjeto.padroesEstruturais.proxy;

import java.util.List;
import java.util.Objects;

public class FuncionarioProxy implements IFuncionario{

    private Funcionario funcionario;
    private Integer id;

    public FuncionarioProxy(Integer id){
        this.id = id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if(this.funcionario == null){
            this.funcionario = new Funcionario(id);
        }
        return this.funcionario.obterDadosPessoais();
    }

    @Override
    public List<Float> obterSalarios(Gerente gerente) {
        if(!Objects.equals(gerente.getSetor(), "RH")){
            throw new IllegalArgumentException("Gerente não autorizado");
        }
        if(this.funcionario == null){
            this.funcionario = new Funcionario(id);
        }
        return this.funcionario.obterSalarios(gerente);
    }
}
