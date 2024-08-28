package card_banco_caixa.br.repository;


import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository {


    Boolean existePorContaNumero(String contaNumero);
}
