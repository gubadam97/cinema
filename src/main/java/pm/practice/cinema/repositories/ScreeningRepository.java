package pm.practice.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pm.practice.cinema.domains.Screening;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {
}
