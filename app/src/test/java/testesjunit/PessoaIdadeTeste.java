package testesjunit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaIdadeTeste {
    
    @Test
    void deveCalcularIdadeCorretamente(){
        PessoaIdade pessoaIdade = new PessoaIdade("Eliana", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(23, pessoaIdade.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        PessoaIdade vera = new PessoaIdade("Vera", LocalDate.of(1965, 3, 30));
        Assertions.assertTrue(vera.maiorDeIdade());
    
        PessoaIdade maju = new PessoaIdade("Maju", LocalDate.of(2023, 5, 15));
        Assertions.assertFalse(maju.maiorDeIdade());
    }

}
