package prova.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import prova.demo.entity.Segnalazione;

import java.time.LocalDate;
import java.util.List;


public interface SegnalazioneRepository extends JpaRepositoryImplementation<Segnalazione, Integer> {

    List<Segnalazione> findByClienteEmail(String emailCliente);
    List<Segnalazione> findByTecnicoDataAssunzione(LocalDate dataAssunzione);
    List<Segnalazione> findByTecnicoDataAssunzioneAndClienteEmail(LocalDate dataAssunzione, String emailCliente);

}
