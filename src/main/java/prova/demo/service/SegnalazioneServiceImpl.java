package prova.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prova.demo.dto.SegnalazioneDTO;
import prova.demo.entity.Segnalazione;
import prova.demo.mapper.SegnalazioneMapper;
import prova.demo.repository.SegnalazioneRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SegnalazioneServiceImpl implements SegnalazioneService {

    @Autowired
    private SegnalazioneRepository segnalazioneRepo;
    @Autowired
    private SegnalazioneMapper segnalazioneMap;

    @Override
    public List<SegnalazioneDTO> segnalazioneList(String cognome, LocalDate creation) {
        List<Segnalazione> listSegnalazioni = new ArrayList<>();
        if(cognome != null && creation != null){
            listSegnalazioni = segnalazioneRepo.findByClienteCognomeAndCreation(cognome, creation);
        } else if (cognome == null && creation != null) {
            listSegnalazioni = segnalazioneRepo.findByCreation(creation);
        } else if (cognome != null) {
            listSegnalazioni = segnalazioneRepo.findByClienteCognome(cognome);
        }
        return listSegnalazioni.stream().map(segnalazione -> segnalazioneMap.EntityToDTO(segnalazione)).toList();
    }

    @Override
    public boolean createSegnalazione(SegnalazioneDTO segnalazioneDTO) {
        Segnalazione newSegnalazione = segnalazioneMap.DTOToEntity(segnalazioneDTO);
        newSegnalazione.setCreation(LocalDate.now());
        segnalazioneRepo.save(newSegnalazione);
        return true;
    }

    @Override
    public boolean deleteSegnalazione(Long idSegnalazione) {
        segnalazioneRepo.deleteById(idSegnalazione);
        return true;
    }
}