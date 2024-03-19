package DgDev021.com.github.ProjetoBancario.domain.enums;

import java.util.EnumSet;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FunctionEmployee {

  INTERN(0, "INTERN"),
  RECEPICIONIST(1, "RECEPICIONIST"),
  BANKER(2, "BANKER"),
  SACURITY(3, "SACURITY"),
  ANALIST(3, "ANALIST");

  private int cod;
  private String descricao;

  public static FunctionEmployee toEnum(Integer cod) {
  return EnumSet.allOf(FunctionEmployee.class).stream()
      .filter(e -> e.getCod() == (cod))
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException("Invalid Id: " + cod));
  }

}
