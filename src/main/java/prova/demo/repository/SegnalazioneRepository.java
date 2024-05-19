package prova.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import prova.demo.entity.Segnalazione;

public interface SegnalazioneRepository extends JpaRepositoryImplementation<Segnalazione, Long> {
}
