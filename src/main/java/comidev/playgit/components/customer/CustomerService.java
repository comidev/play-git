package comidev.playgit.components.customer;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
}
