package br.com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.clinica.models.Medic;

public interface MedicRepository extends JpaRepository<Medic, Long> {
  
}
