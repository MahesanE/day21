package sg.edu.nus.iss.day21_lecture.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    private Integer id;

    private String roomType;

    private Float price;

    
}
