package by.epamlab.handlers;

import by.epamlab.product.Product;
import by.epamlab.stock.Stock;

public abstract class Handler {

    private Handler next;

    protected Stock stock;

    public Handler(Stock stock) {
        this.stock = stock;
    }

    public void setNextHandler(Handler next){
        this.next = next;
    }

    public abstract void check(Product product);

    protected void checkNext(Product product){
        if (next != null) {
            next.check(product);
        }
    }
}
