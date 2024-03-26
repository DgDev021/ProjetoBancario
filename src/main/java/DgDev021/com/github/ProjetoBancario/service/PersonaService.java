package DgDev021.com.github.ProjetoBancario.service;

import DgDev021.com.github.ProjetoBancario.domain.Persona;
import DgDev021.com.github.ProjetoBancario.exception.BankObjectNotFoundException;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import DgDev021.com.github.ProjetoBancario.repository.PersonaRepository;

@Service
public class PersonaService {

  @Autowired
  private PersonaRepository personaRepository;

  public Persona createPersona(Persona persona){
    persona.setId(null);
    persona.setLastLogin(LocalDateTime.now());
    persona.setWhenCreated(LocalDateTime.now());
    Persona savedPersona = personaRepository.save(persona);

    return savedPersona;
  }

  public Persona findPersona(Long id){
    Optional<Persona> optionalPersona = personaRepository.findById(id);

    return optionalPersona.orElseThrow(() -> new BankObjectNotFoundException("Persona Not Found with id: " + id));
  }

}
