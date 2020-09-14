package by.epamlab.external.service;

import by.epamlab.client.Ticket;

public interface TicketService {

    int calculate();
    boolean validateTicket();
    void book();

}
