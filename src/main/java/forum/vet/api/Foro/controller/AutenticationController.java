package forum.vet.api.Foro.controller;

import forum.vet.api.Foro.infra.security.DatosTokenJWT;
import forum.vet.api.Foro.infra.security.TokensService;
import forum.vet.api.Foro.usuarios.DatosAutenticacion;
import forum.vet.api.Foro.usuarios.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class AutenticationController {

    @Autowired
    private TokensService tokensService;
    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity iniciarSesion(@RequestBody @Valid DatosAutenticacion datos) {

        try {
            var autenticationToken = new UsernamePasswordAuthenticationToken(datos.login(), datos.contrasena());
            var autenticacion = manager.authenticate(autenticationToken);
            var tokenJWT = tokensService.generarToken((Usuario) autenticacion.getPrincipal());
            return ResponseEntity.ok(new DatosTokenJWT(tokenJWT));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
