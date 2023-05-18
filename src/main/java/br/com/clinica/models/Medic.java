package br.com.clinica.models;

import br.com.clinica.dto.CreateMedicDto;
import br.com.clinica.enums.Especialidade;
import jakarta.annotation.Generated;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "medics")
@Table(name = "medics")

public class Medic {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;  
  private String email;
  private String crm;

  @Enumerated(EnumType.STRING)
  private Especialidade especialidade;
  
  @Embedded
  private Endereco endereco;

  public Medic(CreateMedicDto data) {
    this.nome = data.nome();
    this.email = data.email();
    this.crm = data.crm();
    this.especialidade = data.especialidade();
    this.endereco = new Endereco(data.endereco());

  }


  
}
