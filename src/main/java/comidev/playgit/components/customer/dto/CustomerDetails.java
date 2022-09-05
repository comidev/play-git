package comidev.playgit.components.customer.dto;

import comidev.playgit.components.customer.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CustomerDetails {
    private Long id;
    private String name;
    private String email;
    private Integer edad;

    public CustomerDetails(Customer entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.edad = entity.getEdad();
    }
}
