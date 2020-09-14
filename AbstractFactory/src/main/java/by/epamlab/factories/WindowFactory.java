package by.epamlab.factories;

import by.epamlab.products.PlasticWindow;
import by.epamlab.products.SpecialWindow;
import by.epamlab.products.WoodenWindow;

public interface WindowFactory {

    PlasticWindow createPlasticWindow();
    WoodenWindow createWoodenWindow();
    SpecialWindow createSpecialWindow();
}
