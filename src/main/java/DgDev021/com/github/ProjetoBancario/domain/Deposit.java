package DgDev021.com.github.ProjetoBancario.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Deposit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JsonIgnore
  private BigDecimal totalDeposited = new BigDecimal(BigInteger.ZERO);

  @JsonIgnore
  @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
  private LocalDateTime whenCrated;

  @ManyToOne
  @JoinColumn(name = "account_id")
  private Account account;

}
