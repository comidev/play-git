package comidev.playgit.components.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import comidev.playgit.components.customer.dto.CustomerCreate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private Integer edad;

    public Customer(CustomerCreate dto) {
        this.name = dto.getName();
        this.email = dto.getEmail();
        this.edad = dto.getEdad();
    }

    public Customer(Long id) {
        this.id = id;
    }

}
