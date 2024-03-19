package repository;

import DgDev021.com.github.ProjetoBancario.domain.Transfer;
import DgDev021.com.github.ProjetoBancario.domain.Withdraw;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WithdrawRepository extends JpaRepository<Withdraw, Long> {

}
