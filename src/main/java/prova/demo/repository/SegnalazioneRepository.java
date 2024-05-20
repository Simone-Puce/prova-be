package prova.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import prova.demo.entity.Segnalazione;

import java.time.LocalDate;
import java.util.List;

public interface SegnalazioneRepository extends JpaRepositoryImplementation<Segnalazione, Long> {

    List<Segnalazione> findByClienteCognome(String cognome);
    List<Segnalazione> findByCreation(LocalDate creation);
    List<Segnalazione> findByClienteCognomeAndCreation(String cognome, LocalDate creation);
}
