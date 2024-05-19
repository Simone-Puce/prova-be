package prova.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import prova.demo.entity.Tecnico;

public interface TecnicoRepository extends JpaRepositoryImplementation<Tecnico, Long> {
}
