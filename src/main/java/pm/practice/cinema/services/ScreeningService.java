package pm.practice.cinema.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pm.practice.cinema.domains.Screening;
import pm.practice.cinema.dto.incoming.ScreeningCommand;
import pm.practice.cinema.repositories.ScreeningRepository;

@Transactional
@Service
public class ScreeningService {

    private ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public void addScreening(ScreeningCommand command) {
        screeningRepository.save(new Screening(command));
    }
}
