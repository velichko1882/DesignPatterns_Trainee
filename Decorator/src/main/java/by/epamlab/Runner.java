package by.epamlab;

import by.epamlab.cafe.Coffee;
import by.epamlab.cafe.Drink;
import by.epamlab.cafe.Tea;
import by.epamlab.decorators.CinnamonAdditionDecorator;
import by.epamlab.decorators.MilkAdditionDecorator;
import by.epamlab.decorators.SugarAdditionDecorator;

public class Runner {

    public static void main(String[] args) {

        Drink coffee = new Coffee();
        Drink coffeeMilk = new MilkAdditionDecorator(coffee);
        Drink coffeMilkSugar = new SugarAdditionDecorator(coffeeMilk);
        Drink coffeMilkSugarCinnamon = new CinnamonAdditionDecorator(coffeMilkSugar);
        Drink coffeeMilkCinnamon = new CinnamonAdditionDecorator(coffeeMilk);

        coffee.make();
        coffeeMilk.make();
        coffeMilkSugar.make();
        coffeMilkSugarCinnamon.make();
        coffeeMilkCinnamon.make();

        Drink tea = new Tea();
        Drink teaSugar = new SugarAdditionDecorator(tea);
        Drink teaMilk = new MilkAdditionDecorator(tea);
        Drink teaMilkSugar = new SugarAdditionDecorator(teaMilk);

        tea.make();
        teaSugar.make();
        teaMilk.make();
        teaMilkSugar.make();

        Drink teaCinnamonMilkSugar =
                new SugarAdditionDecorator(new MilkAdditionDecorator(new CinnamonAdditionDecorator(new Tea())));

        teaCinnamonMilkSugar.make();
    }
}
