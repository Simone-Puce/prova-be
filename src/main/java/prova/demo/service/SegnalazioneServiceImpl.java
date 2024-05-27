package prova.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prova.demo.dto.SegnalazioneDTO;
import prova.demo.entity.Segnalazione;
import prova.demo.mapper.SegnalazioneMapper;
import prova.demo.repository.SegnalazioneRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class SegnalazioneServiceImpl implements SegnalazioneService {

    private final static String messaggioEliminazione = "Segnalazione eliminata";
    @Autowired
    private SegnalazioneRepository segnalazioneRepository;
    @Autowired
    private SegnalazioneMapper segnalazioneMapper;

    @Override
    public List<SegnalazioneDTO> getSegnalazioni(LocalDate assunzioneTecnico, String emailCliente) {
        List<Segnalazione> listSegnalazioni = new ArrayList<>();
        if(assunzioneTecnico != null && emailCliente != null){
            listSegnalazioni = segnalazioneRepository.findByTecnicoDataAssunzioneAndClienteEmail(assunzioneTecnico, emailCliente);
        } else if (assunzioneTecnico != null) {
            listSegnalazioni = segnalazioneRepository.findByTecnicoDataAssunzione(assunzioneTecnico);
        } else if( emailCliente != null) {
            listSegnalazioni = segnalazioneRepository.findByClienteEmail(emailCliente);
        }else {
            listSegnalazioni = segnalazioneRepository.findAll();
        }
        return listSegnalazioni.stream().map(segnalazione -> segnalazioneMapper.entityToDTO(segnalazione)).toList();
    }

    @Override
    public SegnalazioneDTO createSegnalazione(SegnalazioneDTO segnalazioneDTO) {
        segnalazioneDTO.setDataOra(LocalDateTime.now());
        segnalazioneRepository.save(segnalazioneMapper.DTOToEntity(segnalazioneDTO));
        return segnalazioneDTO;
    }

    @Override
    public String deleteSegnalazione(Integer id) {
        segnalazioneRepository.deleteById(id);
        return messaggioEliminazione;
    }
}