package sg.edu.nus.iss.day21_lecture.Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    
    private Integer id;

    private String firstName;

    private String lastName;

    private Date dob;

    
}
