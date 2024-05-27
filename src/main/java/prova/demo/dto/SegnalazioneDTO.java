package prova.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class SegnalazioneDTO {

    private Integer idSegnalazione;
    private ClienteDTO cliente;
    private TecnicoDTO tecnico;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataOra;

    public SegnalazioneDTO () {}

    public SegnalazioneDTO(Integer idSegnalazione, ClienteDTO cliente, TecnicoDTO tecnico, LocalDateTime dataOra) {
        this.idSegnalazione = idSegnalazione;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.dataOra = dataOra;
    }

    public Integer getIdSegnalazione() {
        return idSegnalazione;
    }

    public void setIdSegnalazione(Integer idSegnalazione) {
        this.idSegnalazione = idSegnalazione;
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

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }
}
