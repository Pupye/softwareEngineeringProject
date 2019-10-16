package com.Almus.Dao;

import com.Almus.Entity.Student;
import com.Almus.Entity.Train;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TrainDao {
    private static Map<Integer, Train> trains;

    static {
        trains = new HashMap<Integer, Train>(){
            {
                put(1, new Train(1, 500, "A", "23.02.11"));
            }
        };
    }

    public Collection<Train> getAllTrains(){
        return trains.values();
    }

    public Train getTrainById(int id) {
        return trains.get(id);
    }

}
