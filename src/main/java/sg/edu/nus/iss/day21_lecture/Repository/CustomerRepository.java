package sg.edu.nus.iss.day21_lecture.Repository;

// import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.day21_lecture.Model.Customer;
// import sg.edu.nus.iss.day21_lecture.Model.Order;

@Repository
public class CustomerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String findAllSQL = "select * from customer";

    private final String findAllSQLLimitOffset = "select * from customer limit ? offset ?";

    private final String findByIdSQL = "select * from customer where id = ?";

    // private final String findByOrderId = "select * from orders where customer_id = ?";

    public List<Customer> getAllCustomers() {
        final List<Customer> custList = new ArrayList<Customer>();

        final SqlRowSet rs = jdbcTemplate.queryForRowSet(findAllSQL);

        while (rs.next()) {
            Customer cust = new Customer();
            cust.setId(rs.getInt("id"));
            cust.setFirstName(rs.getString("first_name"));
            cust.setLastName(rs.getString("last_name"));
            cust.setDob(rs.getDate("dob"));
            custList.add(cust);
        }
        return Collections.unmodifiableList(custList);
    }

    public List<Customer> getAllCustomersWithLimitOffset(int limit, int offset) {
        final List<Customer> custList = new ArrayList<Customer>();

        final SqlRowSet rs = jdbcTemplate.queryForRowSet(findAllSQLLimitOffset, limit, offset);

        while (rs.next()) {
            Customer cust = new Customer();
            cust.setId(rs.getInt("id"));
            cust.setFirstName(rs.getString("first_name"));
            cust.setLastName(rs.getString("last_name"));
            cust.setDob(rs.getDate("dob"));
            custList.add(cust);
        }
        return Collections.unmodifiableList(custList);
    }

    public Customer getCustomerById(int id) {
        return jdbcTemplate.queryForObject(findByIdSQL, BeanPropertyRowMapper.newInstance(Customer.class), id);

    }

    // public List<Order> getAllOrders(){
        
    //     final List<Order> orderList = new ArrayList<Order>();
    //     final SqlRowSet rs = jdbcTemplate.queryForRowSet(findByOrderId);
    //     while(rs.next()){
    //         Order order = new Order();
    //         order.setCustomerId(rs.getInt("customer_id"));
    //         order.setShipName(rs.getString("ship_name"));
    //         order.setOrderDate((LocalDateTime)rs.getObject("order_date"));


    //     }

    // }

}