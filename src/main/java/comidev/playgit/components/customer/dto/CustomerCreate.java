package comidev.playgit.components.customer.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CustomerCreate {
    @NotEmpty(message = "No puede ser vacio")
    private String name;
    @NotEmpty(message = "No puede ser vacio")
    @Email(message = "Debe ser un email")
    private String email;
    @Positive(message = "Debe ser mayor a 0")
    private Integer edad;
}
