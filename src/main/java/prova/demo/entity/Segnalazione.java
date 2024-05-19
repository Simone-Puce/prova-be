package prova.demo.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "segnalazioni")
public class Segnalazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descrizione")
    private String descrizione;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "tecnico_id", nullable = false)
    private Tecnico tecnico;

    @Column(name = "creation_date")
    private LocalDate creation;

    public Segnalazione(long id, String descrizione, Cliente cliente, Tecnico tecnico, LocalDate creation) {
        this.id = id;
        this.descrizione = descrizione;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.creation = creation;
    }

    public Segnalazione() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getCreation() {
        return creation;
    }

    public void setCreation(LocalDate creation) {
        this.creation = creation;
    }
}
