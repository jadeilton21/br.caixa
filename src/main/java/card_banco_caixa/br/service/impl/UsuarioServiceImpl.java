package card_banco_caixa.br.service.impl;

import card_banco_caixa.br.doMain.model.Usuario;
import card_banco_caixa.br.doMain.repository.UsuarioRepository;
import card_banco_caixa.br.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class UsuarioServiceImpl implements UsuarioService {


    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario encontrarUsuarioPoId(Long id) {
        return  usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario criarUsuario(Usuario usuarioCriar) {
        if (usuarioRepository.existsByNumeroConta(usuarioCriar.getConta().getNumero())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return usuarioRepository.save(usuarioCriar);

    }

    @Override
    public Usuario alterarUsuario(Usuario usuarioAlterar) {
        return null;
    }
}
