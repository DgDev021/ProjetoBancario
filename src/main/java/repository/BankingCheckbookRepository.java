package repository;

import DgDev021.com.github.ProjetoBancario.domain.Agency;
import DgDev021.com.github.ProjetoBancario.domain.BankingCheckbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankingCheckbookRepository extends JpaRepository<BankingCheckbook, Long> {

}
