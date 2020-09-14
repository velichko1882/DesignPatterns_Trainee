package by.epamlab.facade;

import by.epamlab.store.Courier;
import by.epamlab.store.Seller;
import by.epamlab.store.Stockman;

public class OrderFacade {

    private Seller seller;
    private Stockman stockman;
    private Courier courier;

    public OrderFacade() {
        this.seller = new Seller();
        this.stockman = new Stockman();
        this.courier = new Courier();
    }

    public void order(){
        System.out.println("Order is open.");
        seller.getRequest();
        seller.goToStock();
        stockman.findProduct();
        stockman.packProduct();
        seller.deliverToStore();
        seller.makePayment();
        courier.deliverToBuyer();
        System.out.println("Order is complete.");
    }
}
