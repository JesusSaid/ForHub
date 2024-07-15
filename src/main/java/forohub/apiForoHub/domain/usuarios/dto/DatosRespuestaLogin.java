package forohub.apiForoHub.domain.usuarios.dto;

public record DatosRespuestaLogin(
        String email,
        String status,
        String jwt_token
) {
}
