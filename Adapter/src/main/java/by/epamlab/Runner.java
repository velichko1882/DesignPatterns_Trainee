package by.epamlab;

import by.epamlab.adapters.ExternalServiceAdapter;
import by.epamlab.client.OrderTicket;
import by.epamlab.client.Ticket;
import by.epamlab.client.TicketBooking;
import by.epamlab.external.service.OrderTicketWithService;
import by.epamlab.external.service.TicketService;

import java.util.Date;

public class Runner {

    public static void main(String[] args) {

        Ticket movie = new Ticket("Terminator", "2019.07.20", 15, 10, 0);
        Ticket cartoon = new Ticket("Toy story", "2019.07.15", 25, 8, 1);
        Ticket concert = new Ticket("Scorpions", "2019.08.25", 56, 150, 10);

        TicketBooking orderMovie = new OrderTicket(movie);

        TicketService orderMovieService = new OrderTicketWithService(movie);
        TicketService orderCartoonService = new OrderTicketWithService(cartoon);
        TicketService orderConcertService = new OrderTicketWithService(concert);

        TicketBooking orderMovieServiceAdaptor = new ExternalServiceAdapter(orderMovieService);
        TicketBooking orderCartoonServiceAdaptor = new ExternalServiceAdapter(orderCartoonService);
        TicketBooking orderConcertServiceAdaptor = new ExternalServiceAdapter(orderConcertService);

        orderMovie.bookTicket();
        orderMovieServiceAdaptor.bookTicket();
        orderCartoonServiceAdaptor.bookTicket();
        orderConcertServiceAdaptor.bookTicket();

    }

}
