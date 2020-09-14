package by.epamlab.decorators;

import by.epamlab.cafe.Drink;

public class SugarAdditionDecorator extends AdditionDecorator {

    public SugarAdditionDecorator(Drink decoratedDrink) {
        super(decoratedDrink);
    }

    @Override
    public void make() {
        super.make();
        addSugar();
    }

    private void addSugar(){
        System.out.println("... with sugar");
    }
}
