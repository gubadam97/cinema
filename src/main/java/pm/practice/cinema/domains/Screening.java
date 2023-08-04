package pm.practice.cinema.domains;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pm.practice.cinema.dto.incoming.ScreeningCommand;

import java.time.LocalDateTime;

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
    private Integer totalSeat;

    @Column
    private String pictureUrl;

    public Screening(ScreeningCommand command) {
        this.title = command.getTitle();
        this.screeningDate = command.getScreeningDate();
        this.totalSeat = command.getTotalSeat();
        this.pictureUrl = command.getPictureUrl();
    }
}
