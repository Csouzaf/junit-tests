package testesjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {
    
    @Test
    //@EnabledIfEnvironmentVariable - execute the test with a condtional

    @EnabledIfEnvironmentVariable(named = "USER", matches = "caique")
    void validarAlgoUsuarioCaique(){

        //Don't need assumptions in conditional
        // Assumptions.assumeFalse("caique".equals(System.getenv("USER")));
        
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "caique")
    void validarAlgoUsuarioCaiqueDesabilitado(){
         Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void validarAlgoUsuarioCaiqueSistemaOperacional(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void validarAlgoUsuarioCaiqueSistemaOperacionalArray(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_20)
    void validarAlgoUsuarioCaiqueJREArray(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
