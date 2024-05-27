package prova.demo.dto;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class TecnicoDTO {

    private Integer idTecnico;
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private String specializzazione;
    private LocalDate dataAssunzione;

    public TecnicoDTO () {}

    public TecnicoDTO(Integer idTecnico, String nome, String cognome, String email, String telefono, String specializzazione, LocalDate dataAssunzione) {
        this.idTecnico = idTecnico;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.specializzazione = specializzazione;
        this.dataAssunzione = dataAssunzione;
    }

    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }
}
