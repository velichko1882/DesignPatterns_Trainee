package by.epamlab.handlers;

import by.epamlab.product.Product;
import by.epamlab.stock.Stock;

public class ProductHandler extends Handler {

    public ProductHandler(Stock stock) {
        super(stock);
    }

    @Override
    public void check(Product product) {
        if (!stock.isFindProduct(product)){
            System.out.println("Product not found.");
        } else {
            checkNext(product);
        }
    }
}
