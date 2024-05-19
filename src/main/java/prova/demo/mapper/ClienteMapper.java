package prova.demo.mapper;

import org.springframework.stereotype.Component;
import prova.demo.dto.ClienteDTO;
import prova.demo.dto.TecnicoDTO;
import prova.demo.entity.Cliente;
import prova.demo.entity.Tecnico;

@Component
public class ClienteMapper {

    public ClienteDTO entityToDTO(Cliente cliente){
        return new ClienteDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getCognome(),
                cliente.getEmail()
        );
    }

    public Cliente DTOToEntity(ClienteDTO clienteDTO) {
        Cliente newCliente = new Cliente();
        newCliente.setNome(clienteDTO.getNome());
        newCliente.setCognome(clienteDTO.getCognome());
        newCliente.setEmail(clienteDTO.getEmail());
        return newCliente;
    }
}
