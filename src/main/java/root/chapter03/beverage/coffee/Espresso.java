package root.chapter03.beverage.coffee;

import root.chapter03.beverage.Beverage;
import root.chapter03.beverage.Size;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        Size size = getSize();

        if (size.equals(Size.TALL)) {
            return 1.29;
        } else if (size.equals(Size.GRANDE)) {
            return 1.99;
        } else {
            return 2.79;
        }
    }
}
