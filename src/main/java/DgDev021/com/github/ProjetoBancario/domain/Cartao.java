package DgDev021.com.github.ProjetoBancario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cartao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String numero;

  //private bandeira : BANDEIRA_CARTAO

  private ContaCorrente conta;

  private BigDecimal limite;

  private LocalDate validade;

  private Integer cvv;

  private BigDecimal debito;

  private Boolean credito;

  private Boolean compraOnline;

}
