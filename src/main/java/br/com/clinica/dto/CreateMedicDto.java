package br.com.clinica.dto;

import br.com.clinica.enums.Especialidade;

public record CreateMedicDto(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {

  
  
}
