package br.com.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.clinica.models.Medic;
import br.com.clinica.repository.MedicRepository;

@RestController
@RequestMapping("medic")
public class MedicoController {

  @Autowired
  private MedicRepository medicRepository;

  @PostMapping("/")
  public Medic addMedic(@RequestBody Medic medic){
    return this.medicRepository.save(medic);
  }

  
  
}
