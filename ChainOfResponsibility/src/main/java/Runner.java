
import by.epamlab.handlers.Handler;
import by.epamlab.handlers.PackingHandler;
import by.epamlab.handlers.ProductHandler;
import by.epamlab.handlers.StockHandler;
import by.epamlab.handlers.ConveyorHandler;
import by.epamlab.product.Product;
import by.epamlab.stock.Stock;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Product product1 = new Product("TV", "Sony", "SVR440", 870, 1.5);
        Product product2 = new Product("Oven", "Bosch", "OVJ89-1", 1400, 2.3);
        Product product3 = new Product("Washer", "Sumsung", "SGN25", 570, 1.9);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        Stock stock = new Stock(true, 125.1, true, products);

        Product orderedProduct = new Product("Oven", "Bosch", "OVJ89-1", 1400, 2.3);

        Handler stockHandler = new StockHandler(stock);
        Handler productHandler = new ProductHandler(stock);
        Handler packingHandler = new PackingHandler(stock);
        Handler conveyorHandler = new ConveyorHandler(stock);

        stockHandler.setNextHandler(productHandler);
        productHandler.setNextHandler(packingHandler);
        packingHandler.setNextHandler(conveyorHandler);

        stockHandler.check(orderedProduct);

        stock.setStockIsClose();
        stockHandler.check(orderedProduct);

        stock.setStockIsOpen();
        stockHandler.check(orderedProduct);

        stock.setConveyorIsBroken();
        stockHandler.check(orderedProduct);
    }
}
