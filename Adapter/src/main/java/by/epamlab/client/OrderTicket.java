package by.epamlab.client;

public class OrderTicket implements TicketBooking {

    private static int counterOrder = 1000;

    private int orderId;
    private Ticket ticket;

    public OrderTicket() {
    }

    public OrderTicket(Ticket ticket) {
        this.orderId = ++counterOrder;
        this.ticket = ticket;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order ticket:\n");
        sb.append("order number = ").append(orderId);
        sb.append(", \nticket = ").append(ticket);
        sb.append(", \nprice = ").append(getPrice()).append(" dollars.\n");
        return sb.toString();
    }

    @Override
    public int getPrice() {
        return ticket.getCost() - ticket.getDiscount();
    }

    @Override
    public boolean validate() {
        return ticket.isBooked();
    }

    @Override
    public void bookTicket() {
        if (validate()){
            System.out.println("This ticket has already been booked. Please try a different ticket.\n");
        } else {
            ticket.setBooked(true);
            System.out.println(toString());
        }
    }

}
