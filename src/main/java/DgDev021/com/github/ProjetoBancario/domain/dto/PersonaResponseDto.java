package DgDev021.com.github.ProjetoBancario.domain.dto;


import DgDev021.com.github.ProjetoBancario.domain.enums.TypeKey;
import lombok.Data;

@Data
public class PersonaResponseDto {

  private Long id;
  private String name;
  private String email;
  private String cpf;
  private Integer typeKey;
  private Character gender;

  public TypeKey getTypeKey(){
    return TypeKey.toEnum(this.typeKey);
  }

  public void setTypeKey(TypeKey typeKey){
    this.typeKey = typeKey.getCod();
  }

}
