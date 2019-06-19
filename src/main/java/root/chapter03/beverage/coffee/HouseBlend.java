package root.chapter03.beverage.coffee;

import root.chapter03.beverage.Beverage;
import root.chapter03.beverage.Size;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        Size size = getSize();

        if (size.equals(Size.TALL)) {
            return 0.59;
        } else if (size.equals(Size.GRANDE)) {
            return 0.89;
        } else {
            return 1.99;
        }
    }
}
