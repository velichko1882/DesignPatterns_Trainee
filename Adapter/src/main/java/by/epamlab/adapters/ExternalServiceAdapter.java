package by.epamlab.adapters;

import by.epamlab.client.Ticket;
import by.epamlab.client.TicketBooking;
import by.epamlab.external.service.TicketService;

public class ExternalServiceAdapter implements TicketBooking {

    private TicketService ticketService;

    public ExternalServiceAdapter(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Override
    public int getPrice() {
        return ticketService.calculate();
    }

    @Override
    public boolean validate() {
        return ticketService.validateTicket();
    }

    @Override
    public void bookTicket() {
        ticketService.book();
    }
}
