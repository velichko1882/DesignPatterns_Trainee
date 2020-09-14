package by.epamlab.stock;

import by.epamlab.product.Product;

import java.util.List;

public class Stock {

    private boolean isOpen;
    private double packingInMeters;
    private boolean isConveyorWork;
    private List<Product> products;

    public Stock(boolean isOpen, double packingInMeters, boolean isConveyorWork, List<Product> products) {
        this.isOpen = isOpen;
        this.packingInMeters = packingInMeters;
        this.isConveyorWork = isConveyorWork;
        this.products = products;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setStockIsOpen() {
        isOpen = true;
    }

    public void setStockIsClose() {
        isOpen = false;
    }

    public double getPackingInMeters() {
        return packingInMeters;
    }

    public void setPackingInMeters(double packingInMeters) {
        this.packingInMeters = packingInMeters;
    }

    public boolean isConveyorWork() {
        return isConveyorWork;
    }

    public void setConveyorIsWork() {
        isConveyorWork = true;
    }

    public void setConveyorIsBroken() {
        isConveyorWork = false;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean isFindProduct(Product product){
        for (Product prod : products) {
            if (prod.equals(product)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAvailablePacking(Product product){
        return packingInMeters > product.getSurfaceArea();
    }
}
