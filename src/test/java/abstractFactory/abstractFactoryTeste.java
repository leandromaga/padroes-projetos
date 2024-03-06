package abstractFactory;

import org.junit.jupiter.api.Test;
import padroesProjeto.abstractFactory.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class abstractFactoryTeste {

    @Test
    void retornarSalarioGerente(){
        FabricaAbstrata fabrica = new FabricaGerente();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals(10000.0f, funcionario.calcularSalario());
    }

    @Test
    void retornarSalarioDesenvolvedor(){
        FabricaAbstrata fabrica = new FabricaDesenvolvedor();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals(5000.0f, funcionario.calcularSalario());
    }

    @Test
    void retornarBonusGerente(){
        FabricaAbstrata fabrica = new FabricaGerente();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals(5000.0f, funcionario.calcularBonus());
    }

    @Test
    void retornarBonusDesenvolvedor(){
        FabricaAbstrata fabrica = new FabricaDesenvolvedor();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals(3000.0f, funcionario.calcularBonus());
    }


}
