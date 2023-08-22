package testesjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class EscolherOrdemTest {
 
    //@Test came firstly
    @Test
    @Order(3)
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

 
    @Test
    @Order(2)
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @Test
    @Order(1)
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }

 
    @Test
    @Order(4)
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}

