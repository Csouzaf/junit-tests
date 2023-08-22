package testesjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    
    @Test
    void validarLancamentoExcecaoTrasferencia(){

       Conta contaOrigem = new Conta("201023", 0);
       Conta contaDestino = new Conta("21846", 100);

       TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
       
       Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1); 
       });
    
    }


    @Test
    void verificarSeTransferenciaNaoVaiLancarExcecao(){

       Conta contaOrigem = new Conta("201023", 0);
       Conta contaDestino = new Conta("21846", 100);

       TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
       
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    
    }
}