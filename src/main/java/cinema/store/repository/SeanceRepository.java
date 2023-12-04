package cinema.store.repository;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cinema.store.entity.ClientEntity;
import cinema.store.entity.SeanceEntity;

@Repository
public interface SeanceRepository extends JpaRepository<SeanceEntity, Long>{
	Optional<SeanceEntity> findBySeanceIdAndStartedAtAfter(Long seanceId, LocalDateTime now);
}
