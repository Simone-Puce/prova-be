package prova.demo.mapper;

import org.springframework.stereotype.Component;
import prova.demo.dto.TecnicoDTO;
import prova.demo.entity.Tecnico;

@Component
public class TecnicoMapper {

    public TecnicoDTO entityToDTO (Tecnico tecnico) {
        return new TecnicoDTO(
                tecnico.getId(),
                tecnico.getNome(),
                tecnico.getCognome()
        );
    }

    public Tecnico DTOToEntity(TecnicoDTO tecnicoDTO) {
        Tecnico newTecnico = new Tecnico();
        newTecnico.setNome(tecnicoDTO.getNome());
        newTecnico.setCognome(tecnicoDTO.getCognome());
        return newTecnico;
    }
}
