package com.digitalinnovationone.personapi.dto.request;

import com.digitalinnovationone.personapi.enums.PhoneType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
    private Long id;
    @Enumerated(EnumType.STRING)
    private PhoneType type;
    @NotEmpty
    @Size(min = 12, max = 14)
    private String number;
}
