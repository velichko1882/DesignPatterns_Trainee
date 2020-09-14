package by.epamlab.product;

import java.util.Objects;

public class Product {

    private String title;
    private String brand;
    private String model;
    private int price;
    private double surfaceArea;

    public Product() {
    }

    public Product(String title, String brand, String model, int price, double surfaceArea) {
        this.title = title;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.surfaceArea = surfaceArea;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("title='").append(title).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append(", surfaceArea=").append(surfaceArea);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (Double.compare(product.surfaceArea, surfaceArea) != 0) return false;
        if (!title.equals(product.title)) return false;
        if (!brand.equals(product.brand)) return false;
        return model.equals(product.model);
    }

}
