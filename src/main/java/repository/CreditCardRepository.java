package repository;

import DgDev021.com.github.ProjetoBancario.domain.BankingCheckbook;
import DgDev021.com.github.ProjetoBancario.domain.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}
