package sg.edu.nus.iss.day21_lecture.Model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Integer id;

    //firstName(Entity AKA from springboot) ---> first_name(SQL)
    //firstname("")---> firstname(SQL)
    private String firstName;

    private String lastName;

    private Integer salary;
    
    private List<Dependent> dependents;
}
