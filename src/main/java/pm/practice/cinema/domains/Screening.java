package pm.practice.cinema.domains;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pm.practice.cinema.dto.incoming.ScreeningCommand;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDateTime screeningDate;

    @Column(nullable = false)
    private Integer totalSeats;

    @Column
    private String pictureUrl;

    @OneToMany(mappedBy = "movieScreening")
    private List<Reservation> reservations = new ArrayList<>();

    public Screening(ScreeningCommand command) {
        this.title = command.getTitle();
        this.screeningDate = command.getScreeningDate();
        this.totalSeats = command.getTotalSeats();
        this.pictureUrl = command.getPictureUrl();
    }
}
