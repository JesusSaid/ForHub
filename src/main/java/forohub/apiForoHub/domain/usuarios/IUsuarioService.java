package forohub.apiForoHub.domain.usuarios;
import forohub.apiForoHub.domain.usuarios.dto.DatosAutenticacionUsuario;
import org.springframework.http.ResponseEntity;

public interface IUsuarioService {

    public ResponseEntity<?> register(DatosAutenticacionUsuario validationDTO);
    public Usuario findUserToCreateTopic(Long id);
}
