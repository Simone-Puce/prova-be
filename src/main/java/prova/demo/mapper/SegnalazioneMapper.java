package prova.demo.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import prova.demo.dto.SegnalazioneDTO;
import prova.demo.entity.Segnalazione;

@Component
public class SegnalazioneMapper {

    @Autowired
    private ClienteMapper clienteMapper;
    @Autowired
    private TecnicoMapper tecnicoMapper;

    public SegnalazioneDTO EntityToDTO (Segnalazione segnalazione) {
        return new SegnalazioneDTO(
                segnalazione.getId(),
                segnalazione.getDescrizione(),
                clienteMapper.entityToDTO(segnalazione.getCliente()),
                tecnicoMapper.entityToDTO(segnalazione.getTecnico()),
                segnalazione.getCreation()
        );
    }

    public Segnalazione DTOToEntity(SegnalazioneDTO segnalazioneDTO) {
        Segnalazione newSegnalazione = new Segnalazione();
        newSegnalazione.setDescrizione(segnalazioneDTO.getDescrizione());
        newSegnalazione.setCliente(clienteMapper.DTOToEntity(segnalazioneDTO.getCliente()));
        newSegnalazione.setTecnico(tecnicoMapper.DTOToEntity(segnalazioneDTO.getTecnico()));
        newSegnalazione.setCreation(segnalazioneDTO.getCreation());
        return newSegnalazione;
    }
}
