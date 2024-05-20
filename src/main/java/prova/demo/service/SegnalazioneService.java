package prova.demo.service;

import prova.demo.dto.SegnalazioneDTO;

import java.time.LocalDate;
import java.util.List;

public interface SegnalazioneService {
    List<SegnalazioneDTO> segnalazioneList(String cognome, LocalDate creation);
    boolean createSegnalazione(SegnalazioneDTO segnalazioneDTO);
    boolean deleteSegnalazione(Long idSegnalazione);
}
