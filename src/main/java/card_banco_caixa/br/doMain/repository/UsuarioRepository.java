package card_banco_caixa.br.doMain.repository;


import card_banco_caixa.br.doMain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Boolean existePorContaNumero(String contaNumero);
}
