package forohub.apiForoHub.domain.resp;

import forohub.apiForoHub.domain.enumeracion.Resuelto;

import java.time.LocalDate;

public record RespuestasLista(
        String username,
        String user_response,
        LocalDate date,
        Resuelto resuelto
) {
}
