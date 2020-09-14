package by.epamlab.external.service;

import by.epamlab.client.Ticket;

public class OrderTicketWithService implements TicketService {

    private static int counter = 0;
    private static final int COMMISSION = 2;

    private int orderNumber;
    private Ticket ticket;

    public OrderTicketWithService() {
    }

    public OrderTicketWithService(Ticket ticket) {
        this.orderNumber = ++counter;
        this.ticket = ticket;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order ticket with service:\n");
        sb.append("Order number = ").append(orderNumber);
        sb.append(", \nticket = ").append(ticket);
        sb.append(", \ncomission = ").append(COMMISSION).append(" dollars");
        sb.append(", \nprice with service = ").append(calculate()).append(" dollars.\n");
        return sb.toString();
    }

    @Override
    public int calculate() {
        return ticket.getCost() - ticket.getDiscount() + COMMISSION;
    }

    @Override
    public boolean validateTicket() {
        return ticket.isBooked();
    }

    @Override
    public void book() {
        if (validateTicket()) {
            System.out.println("Ticket unavailable, try again.\n");
        } else {
            ticket.setBooked(true);
            System.out.println(toString());
        }
    }
}
