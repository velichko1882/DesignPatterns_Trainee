package by.epamlab.handlers;

import by.epamlab.product.Product;
import by.epamlab.stock.Stock;

public class StockHandler extends Handler {

    public StockHandler(Stock stock) {
        super(stock);
    }

    @Override
    public void check(Product product) {
        if (!stock.isOpen()){
            System.out.println("The stock is closed.");
        } else {
            checkNext(product);
        }
    }
}
