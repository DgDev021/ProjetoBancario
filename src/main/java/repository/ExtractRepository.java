package repository;

import DgDev021.com.github.ProjetoBancario.domain.Employee;
import DgDev021.com.github.ProjetoBancario.domain.Extract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtractRepository extends JpaRepository<Extract, Long> {

}
