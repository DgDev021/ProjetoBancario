package DgDev021.com.github.ProjetoBancario.domain;

import DgDev021.com.github.ProjetoBancario.domain.enums.CardIdentification;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @CreditCardNumber
  private String number;

  @ManyToOne
  @JoinColumn(name = "currentAccount_id")
  private CurrentAccount account;

  @Length(max = 3, min = 3)
  private Integer cvv;

  @JsonIgnore
  private BigDecimal limit = new BigDecimal(0);

  private Boolean credit;

  private BigDecimal blocked;

  @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
  private LocalDateTime validity;

  private Boolean onlineShopping;

  private Integer identification;

  @JsonIgnore
  @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
  private LocalDateTime whenCreated;

  public CardIdentification getIdentification() {
    return CardIdentification.toEnum(this.identification);
  }

  public void setIdentification(CardIdentification cardIdentification){
    this.identification = cardIdentification.getCod();
  }

}