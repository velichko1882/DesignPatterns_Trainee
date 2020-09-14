package by.epamlab.store;

public class Seller {

    public Seller() {
    }

    public void getRequest(){
        System.out.println("The seller received a request from the buyer to purchase the goods.");
    }

    public void goToStock(){
        System.out.println("The seller goes to the stock for the goods.");
    }

    public void deliverToStore(){
        System.out.println("The seller delivers the goods to the store.");
    }

    public void makePayment(){
        System.out.println("The seller makes a payment.");
    }
}
