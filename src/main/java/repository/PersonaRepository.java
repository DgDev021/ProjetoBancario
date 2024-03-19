package repository;

import DgDev021.com.github.ProjetoBancario.domain.Loan;
import DgDev021.com.github.ProjetoBancario.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
