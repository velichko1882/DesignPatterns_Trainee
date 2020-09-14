package by.epamlab.factories;


import by.epamlab.products.MinskPlasticWindow;
import by.epamlab.products.MinskWoodenWindow;
import by.epamlab.products.PlasticWindow;
import by.epamlab.products.WoodenWindow;
import by.epamlab.products.SpecialWindow;
import by.epamlab.products.MinskSpecialWindow;

public class MinskWindowFactory implements WindowFactory {

    public MinskWindowFactory() {
    }

    @Override
    public PlasticWindow createPlasticWindow() {
        return new MinskPlasticWindow();
    }

    @Override
    public WoodenWindow createWoodenWindow() {
        return new MinskWoodenWindow();
    }

    @Override
    public SpecialWindow createSpecialWindow() {
        return new MinskSpecialWindow();
    }
}
