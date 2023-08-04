package pm.practice.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pm.practice.cinema.domains.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
