package com.Almus.controller;

import com.Almus.Entity.Train;
import com.Almus.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/trains")
public class TrainController {
    @Autowired
    private TrainService trainService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Train> getAllTrains(){
        return trainService.getAllTrains();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Train getTrainById(@PathVariable("id") int id){
        return trainService.getTrainById(id);
    }
}
