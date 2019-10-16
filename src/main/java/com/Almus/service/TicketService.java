package com.Almus.service;

import com.Almus.Dao.TicketDao;
import com.Almus.Entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class TicketService {
    @Autowired
     private TicketDao ticketDao;

    public Collection<Ticket> getAllTickets(){
        return ticketDao.getAllTickets();
    }
}
