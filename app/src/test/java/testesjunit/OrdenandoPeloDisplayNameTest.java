package testesjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdenandoPeloDisplayNameTest {
    
    //Respected order hte init alphanumerically from displayName
    @Test
    @DisplayName("A")
    void ordenarNomesA(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("D")
    void ordenarNomesD(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("B")
    void ordenarNomesB(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("C")
    void ordenarNomesC(){
        Assertions.assertTrue(true);
    }

}
