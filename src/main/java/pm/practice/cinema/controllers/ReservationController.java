package pm.practice.cinema.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pm.practice.cinema.dto.incoming.ReservationCommand;
import pm.practice.cinema.services.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public ResponseEntity addReservation(@RequestBody ReservationCommand command) {
        reservationService.addReservation(command);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
