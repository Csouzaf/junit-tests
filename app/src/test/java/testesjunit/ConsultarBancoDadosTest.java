package testesjunit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class ConsultarBancoDadosTest {
    
    //BeforeAll - Main/only part of execution before
    @BeforeAll
    static void confguraConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou Configurar Conexao");
    }

    //BeforeEach - Secondary part of execution before 
    @BeforeEach
    void inserirDadosTeste(){
        BancoDeDados.inserirDados(new Pessoa("Caique", LocalDate.of(2000, 1, 10)));
    }

    //AfterEach - Came after before each, revert the beforeeach, it's a Secondary part of execution after
    @AfterEach
    void removeDadosTeste(){
        BancoDeDados.removeDados(new Pessoa("Caique", LocalDate.of(2000, 1, 10)));
    }

    @Test
    void validarDadosRetorno(){
        assertTrue(true);
        System.out.println("Rodando testes");
    }

    
     //AfterAll - Main part of execution after
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Finalizou conexao");

    }

    
}
