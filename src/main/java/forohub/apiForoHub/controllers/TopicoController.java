package forohub.apiForoHub.controllers;


import forohub.apiForoHub.domain.topics.ITopicoService;
import forohub.apiForoHub.domain.topics.TopicoRepository;
import forohub.apiForoHub.domain.topics.DatosRegistroTopico;

import forohub.apiForoHub.domain.users.IUsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    private ITopicoService topicService;
    private IUsuarioService userService;


    public TopicoController(ITopicoService topicService, IUsuarioService userService) {
        this.topicService = topicService;
        this.userService = userService;
    }
    @PostMapping
    @Operation(summary = "Crear topico", description = "Crea un nuevo topico con  la id del usuario, retorna los datos ingresados,el usuario y el correo")
    public ResponseEntity<?> newTopic(@RequestBody @Valid DatosRegistroTopico topicoDTO){
        var userFound = userService.findUserToCreateTopic(topicoDTO.idUsuario());

        var datos = topicService.createTopic(topicoDTO, userFound);
        return ResponseEntity.ok(datos);
    }
}
