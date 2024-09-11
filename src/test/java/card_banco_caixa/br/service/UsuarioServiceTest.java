package card_banco_caixa.br.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureMockMvc
class UsuarioServiceTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Deve Devolver Código http 404 qaundo informações forem invalidas..")
    void encontrarUsuarioPoId() throws Exception {

        
    }
}