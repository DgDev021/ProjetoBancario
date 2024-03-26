package DgDev021.com.github.ProjetoBancario.repository;

import DgDev021.com.github.ProjetoBancario.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
