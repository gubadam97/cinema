package pm.practice.cinema.dto.incoming;

import lombok.Data;

@Data
public class ReservationCommand {
    private String name;
    private Integer numberOfSeats;
    private Long screeningId;
}
