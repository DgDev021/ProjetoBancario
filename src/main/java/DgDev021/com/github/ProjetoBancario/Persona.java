package DgDev021.com.github.ProjetoBancario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
@Data //Cria todos os getter, setters, toString e hashCode
@Builder
@Entity //Isso define que é uma classe do banco de dados
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

  @Id //Define a primary key do banco de dados
  @GeneratedValue(strategy = GenerationType.IDENTITY) //Define o tipo de gerador
  private Long id;

  @Column(name = "name", nullable = false) //Define o padrão para a coluna
  private String name;

  @Email
  private String email;

  private String password;

  @CPF
  private String cpf;

  private LocalDate birthDay;

  private Character gender;

  private LocalDate whenCreated;

  private LocalDate lastLogin;

}
