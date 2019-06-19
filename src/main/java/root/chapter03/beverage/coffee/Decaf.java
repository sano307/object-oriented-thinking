package root.chapter03.beverage.coffee;

import root.chapter03.beverage.Beverage;
import root.chapter03.beverage.Size;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        Size size = getSize();

        if (size.equals(Size.TALL)) {
            return 0.69;
        } else if (size.equals(Size.GRANDE)) {
            return 1.05;
        } else {
            return 1.69;
        }
    }
}
