package comidev.playgit.components.customer;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import comidev.playgit.components.customer.dto.CustomerCreate;
import comidev.playgit.components.customer.dto.CustomerDetails;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    @ResponseBody
    public List<CustomerDetails> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CustomerDetails registerCustomer(
            @RequestBody CustomerCreate body) {
        return customerService.registerCustomer(body);
    }
}
