package forohub.apiForoHub.domain.users;
import org.springframework.http.ResponseEntity;

public interface IUsuarioService {

    public ResponseEntity<?> register(DatosAutenticacionUsuario validationDTO);
    public Usuario findUserToCreateTopic(Long id);
}
