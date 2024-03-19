package repository;

import DgDev021.com.github.ProjetoBancario.domain.Deposit;
import DgDev021.com.github.ProjetoBancario.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
