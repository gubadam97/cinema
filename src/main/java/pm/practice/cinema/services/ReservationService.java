package pm.practice.cinema.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pm.practice.cinema.domains.Reservation;
import pm.practice.cinema.dto.incoming.ReservationCommand;
import pm.practice.cinema.repositories.ReservationRepository;
import pm.practice.cinema.repositories.ScreeningRepository;

@Transactional
@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ScreeningRepository screeningRepository;

    public ReservationService(ReservationRepository reservationRepository, ScreeningRepository screeningRepository) {
        this.reservationRepository = reservationRepository;
        this.screeningRepository = screeningRepository;
    }

    public void addReservation(ReservationCommand command) {
        Reservation reservation = new Reservation(command);
        reservation.setMovieScreening(screeningRepository.findById(command.getScreeningId()).orElse(null));
        reservationRepository.save(reservation);
    }
}
