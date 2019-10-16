package com.Almus.service;

import com.Almus.Dao.RouteDao;
import com.Almus.Entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RouteService {
    @Autowired
    private RouteDao routeDao;

    public Collection<Route> getAllRoutes(){ return routeDao.getAllRoutes(); }

    public Route getRouteById(int id) {
        return routeDao.getRouteById(id);
    }

    public void updateOrInsertRoute(Route route) {
        routeDao.updateOrInsertRoute(route);
    }
}
