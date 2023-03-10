package sg.edu.nus.iss.day21_lecture.Repository;

import java.util.List;

import sg.edu.nus.iss.day21_lecture.Model.Room;

public interface IRoomRepository {

    int count();

    Boolean save(Room room);

    List<Room> findAll();

    Room findById(Integer id);

    int update(Room room);

    int deleteById(Integer id);

    
}
