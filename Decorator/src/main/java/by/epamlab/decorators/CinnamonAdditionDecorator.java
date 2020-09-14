package by.epamlab.decorators;

import by.epamlab.cafe.Drink;

public class CinnamonAdditionDecorator extends AdditionDecorator {

    public CinnamonAdditionDecorator(Drink decoratedDrink) {
        super(decoratedDrink);
    }

    @Override
    public void make() {
        super.make();
        addCinnamon();
    }

    private void addCinnamon(){
        System.out.println("... with cinnamon");
    }
}
