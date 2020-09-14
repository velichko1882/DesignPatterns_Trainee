package by.epamlab.client;

public class Ticket {

    private String eventTitle;
    private String date;
    private int place;
    private int cost;
    private int discount;
    private boolean booked;

    public Ticket() {
    }

    public Ticket(String eventTitle, String date, int place, int cost, int discount) {
        this.eventTitle = eventTitle;
        this.date = date;
        this.place = place;
        this.cost = cost;
        this.discount = discount;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("Title = '").append(eventTitle).append('\'');
        sb.append(", date = ").append(date);
        sb.append(", place number = ").append(place);
        sb.append(", cost = ").append(cost).append(" dollars");
        sb.append(", discount = ").append(discount).append(" dollars");
        sb.append('}');
        return sb.toString();
    }
}
