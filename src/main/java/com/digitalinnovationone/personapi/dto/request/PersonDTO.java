package com.digitalinnovationone.personapi.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private Long id;
    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;
    @Size(min = 2, max = 100)
    private String lastName;
    @CPF
    private String cpf;
    private String birthDate;
    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
}
