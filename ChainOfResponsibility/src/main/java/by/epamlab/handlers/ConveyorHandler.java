package by.epamlab.handlers;

import by.epamlab.product.Product;
import by.epamlab.stock.Stock;

public class ConveyorHandler extends Handler {

    public ConveyorHandler(Stock stock) {
        super(stock);
    }

    @Override
    public void check(Product product) {
        if (!stock.isConveyorWork()){
            System.out.println("Conveyor is not working.");
        } else {
            System.out.println("Validation was successful.");
        }
    }
}
