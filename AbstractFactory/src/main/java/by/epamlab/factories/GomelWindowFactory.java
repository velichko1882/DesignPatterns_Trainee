package by.epamlab.factories;


import by.epamlab.products.GomelPlasticWindow;
import by.epamlab.products.GomelWoodenWindow;
import by.epamlab.products.PlasticWindow;
import by.epamlab.products.WoodenWindow;
import by.epamlab.products.SpecialWindow;
import by.epamlab.products.GomelSpecialWindow;

public class GomelWindowFactory implements WindowFactory {

    public GomelWindowFactory() {
    }

    @Override
    public PlasticWindow createPlasticWindow() {
        return new GomelPlasticWindow();
    }

    @Override
    public WoodenWindow createWoodenWindow() {
        return new GomelWoodenWindow();
    }

    @Override
    public SpecialWindow createSpecialWindow() {
        return new GomelSpecialWindow();
    }
}
