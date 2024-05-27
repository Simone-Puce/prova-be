package prova.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "segnalazioni")
public class Segnalazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_segnalazione")
    private Integer idSegnalazione;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "id_cliente", nullable = false)
    private Cliente cliente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tecnico", nullable = false)
    private Tecnico tecnico;
    @Column(name = "data_ora")
    private LocalDateTime dataOra;

    public Segnalazione () {}

    public Segnalazione(Integer idSegnalazione, LocalDateTime dataOra, Tecnico tecnico, Cliente cliente) {
        this.idSegnalazione = idSegnalazione;
        this.dataOra = dataOra;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }

    public Integer getIdSegnalazione() {
        return idSegnalazione;
    }

    public void setIdSegnalazione(Integer idSegnalazione) {
        this.idSegnalazione = idSegnalazione;
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

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }
}
