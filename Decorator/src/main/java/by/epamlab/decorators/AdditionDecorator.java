package by.epamlab.decorators;

import by.epamlab.cafe.Drink;

public abstract class AdditionDecorator implements Drink {

    private Drink decoratedDrink;

    public AdditionDecorator(Drink decoratedDrink) {
        this.decoratedDrink = decoratedDrink;
    }

    @Override
    public void make() {
        decoratedDrink.make();
    }
}
