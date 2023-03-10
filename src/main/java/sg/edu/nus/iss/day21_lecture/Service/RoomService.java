package sg.edu.nus.iss.day21_lecture.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day21_lecture.Model.Room;
import sg.edu.nus.iss.day21_lecture.Repository.IRoomRepository;

@Service
public class RoomService {
    
    @Autowired
    IRoomRepository roomRepo;

   
    public int count() {
        return roomRepo.count();
    }

    public Boolean save(Room room) {
        return roomRepo.save(room);
    }

    
    public List<Room> findAll() {
        return roomRepo.findAll();
    }

    
    public Room findById(Integer id) {
        return roomRepo.findById(id);
    }

    
    public int update(Room room) {
       return roomRepo.update(room);
    }

    
    public int deleteById(Integer id) {
        return roomRepo.deleteById(id);
    }

}
