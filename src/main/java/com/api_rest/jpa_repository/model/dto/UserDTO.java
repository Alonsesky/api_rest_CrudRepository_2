package com.api_rest.jpa_repository.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTO {

    private Long id;

    @NotBlank(message = "{NotBlank.userDTO.name}")
    @Size(min=3, max=50)
    private String name;

    @NotBlank(message = "{NotBlank.userDTO.lastName}")
    private String lastName;
}
