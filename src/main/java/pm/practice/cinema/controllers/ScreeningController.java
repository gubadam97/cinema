package pm.practice.cinema.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pm.practice.cinema.dto.incoming.ScreeningCommand;
import pm.practice.cinema.dto.outgoing.ScreeningListItem;
import pm.practice.cinema.services.ScreeningService;

import java.util.List;

@RestController
@RequestMapping("/api/screenings")
public class ScreeningController {

    private final ScreeningService screeningService;

    private static final Logger logger = LoggerFactory.getLogger(ScreeningController.class);

    public ScreeningController(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }

    @PostMapping
    public ResponseEntity addScreening(@RequestBody ScreeningCommand command) {
        screeningService.addScreening(command);
        logger.info("New screening added.");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ScreeningListItem>> getAllScreenings() {
        logger.info("Screening page requested.");
        return new ResponseEntity<>(screeningService.getAllScreenings(), HttpStatus.OK);
    }

}
