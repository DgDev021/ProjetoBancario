package DgDev021.com.github.ProjetoBancario.repository;

import DgDev021.com.github.ProjetoBancario.domain.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {

}
