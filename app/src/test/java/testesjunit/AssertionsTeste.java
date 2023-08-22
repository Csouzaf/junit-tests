package testesjunit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class AssertionsTeste {
    
    @Test
    void validarLancamentos(){
        int[] _1lancamento = {10, 20, 50, 30, 9};
        int[] _2lancamento = {1001, 20, 50, 30, 9};

        // Assertions.assertArrayEquals(_1lancamento, _2lancamento);

        assertNotEquals(_1lancamento, _2lancamento);
    }

    @Test
    void validarSeObjNull(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Isaac", LocalDate.of(2023, 8, 21));
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosdeTiposDiferentes(){
        double valor = 5.01;
        double valor2 = 5.01;

        assertEquals(valor, valor2, "true");
    }
}
