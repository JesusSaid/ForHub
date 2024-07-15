package forohub.apiForoHub.domain.topicos.dto;

import forohub.apiForoHub.domain.enumeracion.Status;
import forohub.apiForoHub.domain.respuesta.dto.RespuestasLista;
import forohub.apiForoHub.domain.topicos.Topico;

import java.time.LocalDate;
import java.util.List;

public record DatosTopico(
        String titulo,
        String mensaje,
        String nombreUsuario,
        Status status,
        String nombreCurso
        ) {



}