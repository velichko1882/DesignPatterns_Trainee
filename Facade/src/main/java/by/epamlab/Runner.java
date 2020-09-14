package by.epamlab;

import by.epamlab.facade.OrderFacade;

public class Runner {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.order();
    }
}
