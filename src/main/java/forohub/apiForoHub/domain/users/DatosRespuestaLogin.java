package forohub.apiForoHub.domain.users;

public record DatosRespuestaLogin(
        String email,
        String status,
        String jwt_token
) {
}
