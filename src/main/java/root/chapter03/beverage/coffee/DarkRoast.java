package root.chapter03.beverage.coffee;

import root.chapter03.beverage.Beverage;
import root.chapter03.beverage.Size;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        Size size = getSize();

        if (size.equals(Size.TALL)) {
            return 0.99;
        } else if (size.equals(Size.GRANDE)) {
            return 1.59;
        } else {
            return 1.99;
        }
    }
}
