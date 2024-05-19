package prova.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import prova.demo.entity.Cliente;

public interface ClienteRepository extends JpaRepositoryImplementation<Cliente, Long> {
}
