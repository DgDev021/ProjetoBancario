package DgDev021.com.github.ProjetoBancario.domain;

import DgDev021.com.github.ProjetoBancario.domain.enums.TypeKey;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data     //Gera o Get, Set, Equals e HashCode
@Builder  //Habilita a criação de um objeto staticamente
@Entity   //Isso aqui define que é uma classe do banco de dados
@NoArgsConstructor  //Cria um construtor vazio
@AllArgsConstructor //Cria um construtor com todos parametros
public class Persona {

  @Id //Define qual é a primary Key do banco de dados
  @GeneratedValue(strategy = GenerationType.IDENTITY) //Define o tipo de gerador do PK
  private Long id;

  @Column(name = "name", nullable = false) //Define o padrão para a coluna
  private String name;

  @Email  //Faz a validação do tipo email (@ .com)
  private String email;

  @JsonIgnore
  private String password;

  @ManyToOne
  @JoinColumn(name = "agency_id")
  private Agency agency;

  @JsonIgnore
  @OneToMany(mappedBy = "persona")
  private List<SavingAccount> savinAccounts = new ArrayList<>();

  @JsonIgnore
  @OneToMany(mappedBy = "persona")
  private List<CurrentAccount> currentAccounts = new ArrayList<>();

  @CPF  //Faz a validação matematica do CPF
  private String cpf;

  private Integer typeKey;

  @Column(length = 1)
  private Character gender;

  @JsonIgnore
  @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
  private LocalDateTime lastLogin;

  @JsonIgnore
  @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
  private LocalDateTime whenCreated;

  @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
  private LocalDateTime birthDay;

  @ElementCollection
  @CollectionTable(name = "PIX_KEYS")
  private Set<String> pixKeys;

  public TypeKey getTypeKey(){
    return TypeKey.toEnum(this.typeKey);
  }

  public void setTypeKey(TypeKey typeKey){
    this.typeKey = typeKey.getCod();
  }

}
