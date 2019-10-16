package com.Almus.Dao;


import com.Almus.Entity.Route;
import com.Almus.Entity.Ticket;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TicketDao {
    //TODO

    private static Map<Integer, Ticket> tickets;

    static{
        tickets = new HashMap<Integer, Ticket>(){
            {
                put(1, new Ticket(1,2, 23, 4));
                put(2, new Ticket(1,2, 22, 4));
                put(3, new Ticket(1,2, 21, 4));


            }
        };
    }
    public Collection<Ticket> getAllTickets() {
        return null;
    }

}
