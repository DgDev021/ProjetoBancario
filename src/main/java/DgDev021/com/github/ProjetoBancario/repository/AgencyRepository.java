package DgDev021.com.github.ProjetoBancario.repository;

import DgDev021.com.github.ProjetoBancario.domain.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
  public interface AgencyRepository extends JpaRepository<Agency, Long> {

  }
