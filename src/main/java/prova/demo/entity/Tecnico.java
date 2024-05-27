package prova.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tecnici")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tecnico")
    private Integer idTecnico;
    @Column(name = "nome", length = 30)
    private String nome;
    @Column(name = "cognome", length = 30)
    private String cognome;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "telefono", length = 15)
    private String telefono;
    @Column(name = "specializzazione", length = 15)
    private String specializzazione;
    @Column(name = "data_assunzione")
    private LocalDate dataAssunzione;

    public Tecnico () {}

    public Tecnico(Integer idTecnico, String nome, String cognome, String email, String telefono, String specializzazione, LocalDate dataAssunzione) {
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
