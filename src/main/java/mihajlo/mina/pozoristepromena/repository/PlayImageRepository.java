package mihajlo.mina.pozoristepromena.repository;

import mihajlo.mina.pozoristepromena.model.PlayImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayImageRepository extends JpaRepository<PlayImage, Long> {

    List<PlayImage> getByPlayId(Long playId);

}
