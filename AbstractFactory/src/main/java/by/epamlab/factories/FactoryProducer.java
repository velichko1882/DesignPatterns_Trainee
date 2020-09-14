package by.epamlab.factories;

public class FactoryProducer {

    public static WindowFactory getFactory(String town){
        switch (town.toUpperCase()){
            case "GOMEL":
                return new GomelWindowFactory();
            case "MINSK":
                return new MinskWindowFactory();
            default:
                throw new IllegalArgumentException("There is no factory in this city.");
        }
    }
}
