package comidev.playgit.components.customer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

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

    public CustomerDetails registerCustomer(Customer body) {
        return new CustomerDetails(customerRepo.save(body));
    }
}
