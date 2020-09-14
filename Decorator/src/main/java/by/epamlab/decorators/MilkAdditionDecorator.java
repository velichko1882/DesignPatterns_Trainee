package by.epamlab.decorators;

import by.epamlab.cafe.Drink;

public class MilkAdditionDecorator extends AdditionDecorator {

    public MilkAdditionDecorator(Drink decoratedDrink) {
        super(decoratedDrink);
    }

    @Override
    public void make() {
        super.make();
        addMilk();
    }

    private void addMilk(){
        System.out.println("... with milk");
    }

}
