package by.epamlab.cafe;

public class Coffee implements Drink {

    public Coffee() {
    }

    @Override
    public void make() {
        System.out.println("Coffee is made");
    }
}
