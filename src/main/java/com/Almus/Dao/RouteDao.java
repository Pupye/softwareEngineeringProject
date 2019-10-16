package com.Almus.Dao;

import com.Almus.Entity.*;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RouteDao {
    private static Map<Integer, Route> routes;

    static{
        routes = new HashMap<Integer, Route>(){
            {
                put(1, new Route(1, 1, "23.00 at 15th October",
                        "8:00 at 16th October", 1));
                put(2, new Route(2, 2, "15.00 at 16th October",
                        "15:15 at 16th October", 1));

            }
        };
    }

    public Collection<Route> getAllRoutes(){
        return routes.values();
    }

    public Route getRouteById(int id) {
        return routes.get(id);
    }


    public void updateOrInsertRoute(Route route) {
        routes.put(route.getRouteId(), route);
    }

}
