package card_banco_caixa.br.doMain.repository;


import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository {


    Boolean existePorContaNumero(String contaNumero);
}
