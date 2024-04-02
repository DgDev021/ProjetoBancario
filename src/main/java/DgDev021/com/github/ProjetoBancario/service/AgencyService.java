package DgDev021.com.github.ProjetoBancario.service;

import DgDev021.com.github.ProjetoBancario.domain.Agency;
import DgDev021.com.github.ProjetoBancario.domain.dto.AgencyRequestDto;
import DgDev021.com.github.ProjetoBancario.repository.AgencyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgencyService {

  @Autowired
  private AgencyRepository agencyRepository;

  private ModelMapper mapper;

  public Agency createAgency(AgencyRequestDto agencyDto){
    Agency agency = mapper.map(agencyDto, Agency.class);

    return agencyRepository.save(agency);
  }

}
