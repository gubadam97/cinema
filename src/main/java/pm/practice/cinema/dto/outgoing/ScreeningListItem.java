package pm.practice.cinema.dto.outgoing;

import lombok.Data;
import lombok.NoArgsConstructor;
import pm.practice.cinema.domains.Screening;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ScreeningListItem {

    private Long id;
    private String title;
    private String pictureUrl;
    private LocalDateTime screeningDate;
    private Integer totalSeats;
    private Integer freeSeats;

    public ScreeningListItem(Screening screening) {
        this.id = screening.getId();
        this.title = screening.getTitle();
        this.pictureUrl = screening.getPictureUrl();
        this.screeningDate = screening.getScreeningDate();
        this.totalSeats = screening.getTotalSeats();
        this.freeSeats = screening.getTotalSeats();
    }
}
