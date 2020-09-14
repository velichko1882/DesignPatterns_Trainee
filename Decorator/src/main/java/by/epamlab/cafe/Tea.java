package by.epamlab.cafe;

public class Tea implements Drink {

    public Tea() {
    }

    @Override
    public void make() {
        System.out.println("Tea is made");
    }
}
