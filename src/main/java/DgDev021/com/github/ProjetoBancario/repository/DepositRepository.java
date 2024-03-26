package DgDev021.com.github.ProjetoBancario.repository;

import DgDev021.com.github.ProjetoBancario.domain.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, Long> {

}
