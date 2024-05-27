package prova.demo.mapper;

import org.springframework.stereotype.Component;
import prova.demo.dto.ClienteDTO;
import prova.demo.entity.Cliente;

@Component
public class ClienteMapper {

    public ClienteDTO entityToDTO(Cliente cliente) {
        return new ClienteDTO(
                cliente.getIdCliente(),
                cliente.getNome(),
                cliente.getCognome(),
                cliente.getEmail(),
                cliente.getTelefono()
        );
    }

    public Cliente DTOToEntity(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setCognome(clienteDTO.getCognome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefono(clienteDTO.getTelefono());
        return cliente;
    }
}
