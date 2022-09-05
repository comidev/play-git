package comidev.playgit.components.customer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import comidev.playgit.components.customer.dto.CustomerCreate;
import comidev.playgit.components.customer.dto.CustomerDetails;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;

    public List<CustomerDetails> getAllCustomers() {
        return customerRepo.findAll().stream()
                .map(CustomerDetails::new)
                .collect(Collectors.toList());
    }

    public CustomerDetails registerCustomer(CustomerCreate body) {
        String email = body.getEmail();
        boolean existsEmail = customerRepo.existsByEmail(email);
        if (existsEmail) {
            throw new IllegalArgumentException("El email ya existe!!");
        }
        Customer customer = new Customer(body);
        return new CustomerDetails(customerRepo.save(customer));
    }
}
