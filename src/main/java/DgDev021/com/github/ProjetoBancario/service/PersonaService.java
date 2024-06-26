package DgDev021.com.github.ProjetoBancario.service;


import DgDev021.com.github.ProjetoBancario.domain.Persona;
import DgDev021.com.github.ProjetoBancario.domain.dto.PersonaRequestDto;
import DgDev021.com.github.ProjetoBancario.domain.dto.PersonaResponseDto;
import DgDev021.com.github.ProjetoBancario.exception.BankObjectNotFoundException;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import DgDev021.com.github.ProjetoBancario.repository.PersonaRepository;

@Service
public class PersonaService {

  @Autowired
  private PersonaRepository personaRepository;

  @Autowired
  private ModelMapper mapper;

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

  public Set<PersonaResponseDto> findAllPersonas(){
    List<Persona> personaList = personaRepository.findAll();

    return personaList.stream().map(p -> mapper.map(p, PersonaResponseDto.class)).collect(Collectors.toSet());
  }

  @Transactional
  public PersonaResponseDto updatePersona(Long id, PersonaRequestDto personaRequestDto){
    Persona personaFounded = findPersona(id);
    personaFounded.setPassword(personaRequestDto.getPassword());
    personaFounded.setEmail(personaRequestDto.getEmail());

    Persona personaSaved = personaRepository.save(personaFounded);

    return mapper.map(personaSaved, PersonaResponseDto.class);
  }

  @Transactional
  public void deletePersona(Long id){
    findPersona(id);
    personaRepository.deleteById(id);
  }
}
