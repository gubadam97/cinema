package pm.practice.cinema.domains;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pm.practice.cinema.dto.incoming.ReservationCommand;

@Entity
@Data
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer numberOfSeats;

    @ManyToOne
    @JoinColumn(name = "screening_id")
    private Screening movieScreening;

    public Reservation(ReservationCommand command) {
        this.name = command.getName();
        this.numberOfSeats = command.getNumberOfSeats();
    }
}
