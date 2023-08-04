package pm.practice.cinema.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pm.practice.cinema.domains.Screening;
import pm.practice.cinema.dto.incoming.ScreeningCommand;
import pm.practice.cinema.dto.outgoing.ScreeningListItem;
import pm.practice.cinema.repositories.ScreeningRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class ScreeningService {

    private final ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public void addScreening(ScreeningCommand command) {
        screeningRepository.save(new Screening(command));
    }

    public List<ScreeningListItem> getAllScreenings() {
        return screeningRepository.findAll().stream()
                .map(ScreeningListItem::new)
                .sorted(Comparator.comparing(ScreeningListItem::getScreeningDate))
                .toList();
    }

}
