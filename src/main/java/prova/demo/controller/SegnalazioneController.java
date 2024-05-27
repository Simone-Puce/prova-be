package prova.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prova.demo.dto.SegnalazioneDTO;
import prova.demo.service.SegnalazioneService;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/segnalazioni")
public class SegnalazioneController {

    @Autowired
    private SegnalazioneService segnalazioneService;

    @GetMapping
    public ResponseEntity<List<SegnalazioneDTO>> getSegnalazioni(@RequestParam(required = false) LocalDate dataAssunzione, @RequestParam(required = false) String emailCliente){
        return new ResponseEntity<>(segnalazioneService.getSegnalazioni(dataAssunzione,emailCliente), OK);
    }

    @PostMapping
    public ResponseEntity<SegnalazioneDTO> createSegnalazione(@RequestBody SegnalazioneDTO segnalazioneDTO) {
        return new ResponseEntity<>(segnalazioneService.createSegnalazione(segnalazioneDTO), OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteSegnalazione(@PathVariable Integer id){
        return new ResponseEntity<>(segnalazioneService.deleteSegnalazione(id), OK);
    }
}
