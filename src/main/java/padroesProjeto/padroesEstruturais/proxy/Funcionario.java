package padroesProjeto.padroesEstruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Funcionario implements IFuncionario {

    private Integer id;
    private String nome;
    private String cidade;
    private String senioridade;
    private Float salario;

    public Funcionario(int id){
        this.id = id;
        Funcionario objeto = BD.getFuncionario(id);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.senioridade = objeto.senioridade;
        this.salario = objeto.salario;
    }

    public Funcionario(Integer id, String nome, String cidade, String senioridade, Float salario) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.senioridade = senioridade;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade);
    }

    @Override
    public List<Float> obterSalarios(Gerente gerente) {
        return Arrays.asList(this.salario);
    }

}
