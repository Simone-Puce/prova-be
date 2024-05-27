package prova.demo.mapper;

import org.springframework.stereotype.Component;
import prova.demo.dto.TecnicoDTO;
import prova.demo.entity.Tecnico;

@Component
public class TecnicoMapper {

    public TecnicoDTO entityToDTO(Tecnico tecnico) {
        return new TecnicoDTO(
                tecnico.getIdTecnico(),
                tecnico.getNome(),
                tecnico.getCognome(),
                tecnico.getEmail(),
                tecnico.getTelefono(),
                tecnico.getSpecializzazione(),
                tecnico.getDataAssunzione()
        );
    }

    public Tecnico DTOToEntity(TecnicoDTO tecnicoDTO) {
        Tecnico tecnico = new Tecnico();
        tecnico.setNome(tecnicoDTO.getNome());
        tecnico.setCognome(tecnicoDTO.getCognome());
        tecnico.setEmail(tecnicoDTO.getEmail());
        tecnico.setSpecializzazione(tecnicoDTO.getSpecializzazione());
        tecnico.setDataAssunzione(tecnicoDTO.getDataAssunzione());
        tecnico.setTelefono(tecnicoDTO.getTelefono());
        return tecnico;
    }
}
