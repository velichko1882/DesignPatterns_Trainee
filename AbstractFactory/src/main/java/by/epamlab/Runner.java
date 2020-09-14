package by.epamlab;

import by.epamlab.factories.FactoryProducer;
import by.epamlab.factories.WindowFactory;
import by.epamlab.products.PlasticWindow;
import by.epamlab.products.SpecialWindow;
import by.epamlab.products.WoodenWindow;

public class Runner {
    public static void main(String[] args) {

        WindowFactory gomelWindowFactory = FactoryProducer.getFactory("gomel");
        WindowFactory minskWindowFactory = FactoryProducer.getFactory("minsk");

        PlasticWindow gomelPlasticWindow = gomelWindowFactory.createPlasticWindow();
        gomelPlasticWindow.open();
        gomelPlasticWindow.close();
        PlasticWindow minskPlasticWindow = minskWindowFactory.createPlasticWindow();
        minskPlasticWindow.open();
        minskPlasticWindow.close();
        WoodenWindow gomelWoodenWindow = gomelWindowFactory.createWoodenWindow();
        gomelWoodenWindow.open();
        gomelWoodenWindow.close();
        WoodenWindow minskWoodenWindow = minskWindowFactory.createWoodenWindow();
        minskWoodenWindow.open();
        minskWoodenWindow.close();
        SpecialWindow gomelSpecialWindow = gomelWindowFactory.createSpecialWindow();
        gomelSpecialWindow.open();
        gomelSpecialWindow.close();
        SpecialWindow minskSpecialWindow = minskWindowFactory.createSpecialWindow();
        minskSpecialWindow.open();
        minskSpecialWindow.close();
    }

}
