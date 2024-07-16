package forohub.apiForoHub.domain.resp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RespuestasRepository extends JpaRepository<Respuesta, Long> {

    void removeByTopicId(Long id);
}
