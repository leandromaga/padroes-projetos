package prototype;

import org.junit.jupiter.api.Test;
import padroesProjeto.prototype.Carro;
import padroesProjeto.prototype.Registro;

import static org.junit.jupiter.api.Assertions.*;
class CarroTest {

    @Test
    void testCloneAndAccessorsIncludingSetAno() throws CloneNotSupportedException {
        Registro registroOriginal = new Registro("Proprietário Original", 2020);
        Carro carroOriginal = new Carro("Marca A", "Modelo A", registroOriginal);

        Carro carroClonado = carroOriginal.clone();

        assertNotSame(carroOriginal, carroClonado);

        carroClonado.setMarca("Marca B");
        carroClonado.setModelo("Modelo B");
        Registro novoRegistro = new Registro("Proprietário Clonado", 2022);
        carroClonado.setRegistro(novoRegistro);

        assertEquals("Marca B", carroClonado.getMarca());
        assertEquals("Modelo B", carroClonado.getModelo());
        assertNotNull(carroClonado.getRegistro());
        assertEquals(2022, carroClonado.getRegistro().getAno());
        assertEquals("Proprietário Clonado", carroClonado.getRegistro().getProprietario());

        Registro registroAlterado = new Registro("Outro Proprietário", 2023);
        carroOriginal.setRegistro(registroAlterado);
        carroOriginal.getRegistro().setProprietario("Proprietário Alterado");
        carroOriginal.getRegistro().setAno(2024); // Alterando o ano diretamente
        assertEquals("Proprietário Alterado", carroOriginal.getRegistro().getProprietario());
        assertEquals(2024, carroOriginal.getRegistro().getAno());

        assertNotSame(carroOriginal.getRegistro(), carroClonado.getRegistro());

        assertEquals("Carro{marca='Marca A', modelo='Modelo A', registro=Registro{proprietario='Proprietário Alterado', ano=2024}}", carroOriginal.toString());
        assertEquals("Carro{marca='Marca B', modelo='Modelo B', registro=Registro{proprietario='Proprietário Clonado', ano=2022}}", carroClonado.toString());
    }
}