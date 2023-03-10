package sg.edu.nus.iss.day21_lecture.Model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Integer id;

   // private Integer employeeId;

    private Integer customerId;

    private LocalDateTime orderDate;

    private LocalDateTime shippedDate;

    private String shipName;
    
}
