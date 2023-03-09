package sg.edu.nus.iss.day21_lecture.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day21_lecture.Model.Customer;
import sg.edu.nus.iss.day21_lecture.Repository.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository custRepo;

    public List<Customer> retrieveAllCustomers(){
        return custRepo.getAllCustomers();
    }

    public List<Customer> retrieveAllCustomersWithLimitOffset(int limit, int offset){
        return custRepo.getAllCustomersWithLimitOffset(limit, offset);
    }
}
