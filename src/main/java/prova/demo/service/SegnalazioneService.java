package prova.demo.service;

import prova.demo.dto.SegnalazioneDTO;

import java.util.List;

public interface SegnalazioneService {
    List<SegnalazioneDTO> segnalazioneList();
    boolean createSegnalazione(SegnalazioneDTO segnalazioneDTO);
    boolean deleteSegnalazione(Long idSegnalazione);
}
