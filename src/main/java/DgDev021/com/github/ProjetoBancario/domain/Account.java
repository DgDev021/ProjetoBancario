package DgDev021.com.github.ProjetoBancario.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;


@Data
@Entity
public abstract class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "agency_id") //nome da classe no bd e o campo no PK
  private Agency agency;

  @NotNull
  private String number;

  @ManyToOne
  @JoinColumn(name = "persona_id")
  private Persona customers;

  @JsonIgnore
  private BigDecimal balance = new BigDecimal(BigInteger.ZERO);

  @JsonIgnore
  @OneToMany(mappedBy = "account")
  private List<Extract> extractList = new ArrayList<>();

}
