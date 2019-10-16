package com.Almus.service;

import com.Almus.Dao.StationDao;
import com.Almus.Entity.Route;
import com.Almus.Entity.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StationService {
    @Autowired
    private StationDao stationDao;

    public Collection<Station> getAllStation(){
        return stationDao.getAllStations();
    }

}
