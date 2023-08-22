package testesjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class) //Or use .Random 
public class OrdenandoPeloNomeTest {
    
    //Respected order alphanumerically
    @Test
    void ordenarNomesA(){
        Assertions.assertTrue(true);
    }

    @Test
    void ordenarNomesD(){
        Assertions.assertTrue(true);
    }

    @Test
    void ordenarNomesB(){
        Assertions.assertTrue(true);
    }

  
    @Test
    void ordenarNomesC(){
        Assertions.assertTrue(true);
    }

    
}
