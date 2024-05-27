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

    public SegnalazioneDTO entityToDTO(Segnalazione segnalazione) {
        return new SegnalazioneDTO(
                segnalazione.getIdSegnalazione(),
                clienteMapper.entityToDTO(segnalazione.getCliente()),
                tecnicoMapper.entityToDTO(segnalazione.getTecnico()),
                segnalazione.getDataOra()

        );
    }

    public Segnalazione DTOToEntity(SegnalazioneDTO segnalazioneDTO) {
        Segnalazione segnalazione = new Segnalazione();
        segnalazione.setTecnico(tecnicoMapper.DTOToEntity(segnalazioneDTO.getTecnico()));
        segnalazione.setCliente(clienteMapper.DTOToEntity(segnalazioneDTO.getCliente()));
        segnalazione.setDataOra(segnalazioneDTO.getDataOra());
        return segnalazione;
    }
}
