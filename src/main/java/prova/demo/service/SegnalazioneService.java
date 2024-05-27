package prova.demo.service;


import prova.demo.dto.SegnalazioneDTO;

import java.time.LocalDate;
import java.util.List;

public interface SegnalazioneService {

    List<SegnalazioneDTO> getSegnalazioni(LocalDate assunzioneTecnico, String emailCliente);
    SegnalazioneDTO createSegnalazione(SegnalazioneDTO segnalazioneDTO);
    String deleteSegnalazione(Integer id);
}
