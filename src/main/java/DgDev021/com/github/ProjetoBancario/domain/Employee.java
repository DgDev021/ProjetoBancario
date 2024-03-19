package DgDev021.com.github.ProjetoBancario.domain;

import DgDev021.com.github.ProjetoBancario.domain.enums.FunctionEmployee;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends Persona {

  @NotNull
  private Integer function;

  private BigDecimal salary;

  public Integer getFunction(){
    return FunctionEmployee.toEnum(this.function);
  }

  public void setFunction(FunctionEmployee function){
    this.function = function.getCod();
  }

}
