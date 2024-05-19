package prova.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prova.demo.dto.SegnalazioneDTO;
import prova.demo.service.SegnalazioneService;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/segnalazioni")
public class SegnalazioneController {

    @Autowired
    private SegnalazioneService segnalazioneService;

    @GetMapping(value = "/getall")
    public ResponseEntity<List<SegnalazioneDTO>> getAllSegnalazioni() {
        return new ResponseEntity<>(segnalazioneService.segnalazioneList(), OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Boolean> createSegnalazione(@RequestBody SegnalazioneDTO segnalazioneDTO) {
        return new ResponseEntity<>(segnalazioneService.createSegnalazione(segnalazioneDTO), OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Boolean> deleteSegnalazione(@RequestParam Long id) {
        return new ResponseEntity<>(segnalazioneService.deleteSegnalazione(id), OK);
    }

}
