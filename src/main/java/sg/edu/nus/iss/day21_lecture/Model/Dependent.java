package sg.edu.nus.iss.day21_lecture.Model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dependent {
    private Integer id;

    private String fullName;

    private String relationship;

    private Integer employeeId;
    
    private Date birthDate;

    private Employee employee;
}