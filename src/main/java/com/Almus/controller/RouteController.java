package com.Almus.controller;

import com.Almus.Entity.Route;
import com.Almus.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Route> getAllRoutes(){
       return routeService.getAllRoutes();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Route getRouteById(@PathVariable("id") int id){
        return routeService.getRouteById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateOrInsertRoute(@RequestBody Route route){
        routeService.updateOrInsertRoute(route);
    }
}
