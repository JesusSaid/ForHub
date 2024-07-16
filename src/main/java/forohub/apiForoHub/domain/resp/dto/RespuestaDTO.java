package forohub.apiForoHub.domain.resp.dto;

import jakarta.validation.constraints.NotBlank;

public record RespuestaDTO(
        @NotBlank(message = "El mensaje no debe estar vacio")
        String mensaje
) {
}
