package card_banco_caixa.br.controller.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ManipuladorDeExcecaoGlobal {


    private final Logger logger = LoggerFactory.getLogger(ManipuladorDeExcecaoGlobal.class);

}
