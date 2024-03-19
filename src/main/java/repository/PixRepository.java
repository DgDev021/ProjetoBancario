package repository;

import DgDev021.com.github.ProjetoBancario.domain.Persona;
import DgDev021.com.github.ProjetoBancario.domain.Pix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PixRepository extends JpaRepository<Pix, Long> {

}
