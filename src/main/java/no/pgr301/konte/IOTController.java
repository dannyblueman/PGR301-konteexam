package no.pgr301.konte;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class IOTController {

    private final List<Measurement> measurementList = new ArrayList<>();

    @PostMapping(path = "/weather", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Measurement> measure(@RequestBody Measurement measurement) {
        measurementList.add(measurement);
        return ResponseEntity.of(Optional.of(measurement));
    }

    @GetMapping(path = "/weather", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Measurement> get(@RequestBody Measurement measurement) {

        measurementList.add(measurement);
        return new ResponseEntity<>(measurement, HttpStatus.OK);
    }

}