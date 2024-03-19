package repository;

import DgDev021.com.github.ProjetoBancario.domain.Pix;
import DgDev021.com.github.ProjetoBancario.domain.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingAccountRepository extends JpaRepository<SavingAccount, Long> {

}
