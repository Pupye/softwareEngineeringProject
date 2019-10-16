package com.Almus.service;
import com.Almus.Dao.TrainDao;
import com.Almus.Entity.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TrainService {
    @Autowired
    private TrainDao trainDao;

    public Collection<Train> getAllTrains(){
        return trainDao.getAllTrains();
    }

    public Train getTrainById(int id) {
        return trainDao.getTrainById(id);
    }
}
