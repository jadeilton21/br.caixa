package card_banco_caixa.br.controller;


import card_banco_caixa.br.doMain.model.Usuario;
import card_banco_caixa.br.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;


    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }




    @GetMapping("/{id}")
    private ResponseEntity<Usuario> encontrarUsuarioPoId(@PathVariable Long id){
        var user = usuarioService.encontrarUsuarioPoId(id);
        return ResponseEntity.ok(user);

    }
}
