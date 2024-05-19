package prova.demo.dto;

import prova.demo.entity.Cliente;
import prova.demo.entity.Tecnico;
import java.time.LocalDate;

public class SegnalazioneDTO {

    private Long id;
    private String descrizione;
    private ClienteDTO cliente;
    private TecnicoDTO tecnico;
    private LocalDate creation;

    public SegnalazioneDTO() {}

    public SegnalazioneDTO(Long id, String descrizione, ClienteDTO cliente, TecnicoDTO tecnico, LocalDate creation) {
        this.id = id;
        this.descrizione = descrizione;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.creation = creation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public TecnicoDTO getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoDTO tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getCreation() {
        return creation;
    }

    public void setCreation(LocalDate creation) {
        this.creation = creation;
    }
}
