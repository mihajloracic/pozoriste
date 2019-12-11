package mihajlo.mina.pozoristepromena.repository;

import mihajlo.mina.pozoristepromena.model.Play;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayRepository extends JpaRepository<Play, Long> {
}
