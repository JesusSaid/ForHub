package forohub.apiForoHub.domain.resp;

import forohub.apiForoHub.domain.resp.dto.RespuestaDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface IRespuestaService {
    public ResponseEntity<?> answerTopic(@Valid RespuestaDTO dto, Long user_id, Long topic_id);
}
