package card_banco_caixa.br.controller;


import card_banco_caixa.br.doMain.model.Usuario;
import card_banco_caixa.br.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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

    @PostMapping
    private ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario userToCreate){
        var userCreated = usuarioService.criarUsuario(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);

    }
}
