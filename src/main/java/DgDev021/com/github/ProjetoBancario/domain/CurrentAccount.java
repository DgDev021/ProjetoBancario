package DgDev021.com.github.ProjetoBancario.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Table(name = "accountc")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CurrentAccount extends Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JsonIgnore
  @OneToMany(mappedBy = "currentAccount")
  private Set<CreditCard> cards = new HashSet<>();

  @JsonIgnore
  @OneToMany(mappedBy = "currentAccount")
  private Set<Loan> loans = new HashSet<>();

  @JsonIgnore
  @OneToMany(mappedBy = "currentAccount")
  private List<BankingCheckbook> checkbooks;

  @JsonIgnore
  @OneToMany(mappedBy = "currentAccount_id")
  private List<Pix> receivedPix = new ArrayList<>();

  @JsonIgnore
  @OneToMany(mappedBy = "currentAccount_id")
  private List<Deposit> receivedDeposit = new ArrayList<>();

  @JsonIgnore
  @OneToMany(mappedBy = "currentAccount_id")
  private List<Withdraw> withdraws = new ArrayList<>();

}


