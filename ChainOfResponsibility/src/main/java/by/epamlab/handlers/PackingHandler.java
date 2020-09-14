package by.epamlab.handlers;

import by.epamlab.product.Product;
import by.epamlab.stock.Stock;

public class PackingHandler extends Handler {

    public PackingHandler(Stock stock) {
        super(stock);
    }

    @Override
    public void check(Product product) {
        if (!stock.isAvailablePacking(product)){
            System.out.println("No packaging.");
        } else {
            checkNext(product);
        }
    }
}
