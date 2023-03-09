package sg.edu.nus.iss.day21_lecture.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.day21_lecture.Model.Customer;
import sg.edu.nus.iss.day21_lecture.Service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    CustomerService custSvc;
    
    @GetMapping
    public List<Customer> getAllCustomers(){
        return custSvc.retrieveAllCustomers();
    }

    @GetMapping("/limit")
    public List<Customer> getAllCustomers(@RequestParam("limit") int limit, int offset){
        return custSvc.retrieveAllCustomersWithLimitOffset(limit, offset);
    }
}