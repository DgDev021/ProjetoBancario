package repository;

import DgDev021.com.github.ProjetoBancario.domain.Extract;
import DgDev021.com.github.ProjetoBancario.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
