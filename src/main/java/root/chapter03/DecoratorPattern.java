package root.chapter03;

import root.chapter03.beverage.Beverage;
import root.chapter03.beverage.Size;
import root.chapter03.beverage.coffee.DarkRoast;
import root.chapter03.beverage.coffee.Espresso;
import root.chapter03.beverage.coffee.HouseBlend;
import root.chapter03.condiment.Mocha;
import root.chapter03.condiment.Soy;
import root.chapter03.condiment.Whip;

public class DecoratorPattern {
    public static void main(String[] args) {

        Beverage espresso = new Espresso().setSize(Size.TALL);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast().setSize(Size.GRANDE);
        darkRoast = new Whip(new Mocha(new Mocha(darkRoast)));
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend().setSize(Size.VENTI);
        houseBlend = new Whip(new Mocha(new Soy(houseBlend)));
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
