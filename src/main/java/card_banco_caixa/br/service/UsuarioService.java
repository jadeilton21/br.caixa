package card_banco_caixa.br.service;

import card_banco_caixa.br.doMain.model.Usuario;

public interface UsuarioService {


    Usuario encontrarUsuarioPoId(Long id);

    Usuario criarUsuario(Usuario usuarioCriar);
    Usuario alterarUsuario(Usuario usuarioAlterar);




}
