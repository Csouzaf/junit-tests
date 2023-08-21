package testesjunit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    
    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Caique", LocalDate.of(2020,1,1));
        Assertions.assertEquals(3, pessoa.getIdade());
    }
}
