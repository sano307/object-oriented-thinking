package root.chapter03.condiment;

import root.chapter03.beverage.Beverage;
import root.chapter03.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
