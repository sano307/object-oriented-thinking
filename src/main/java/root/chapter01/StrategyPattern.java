package root.chapter01;

import root.chapter01.behavior.fly.FlyRocketPowered;
import root.chapter01.behavior.quack.Squeak;
import root.chapter01.model.Duck;
import root.chapter01.model.MallardDuck;
import root.chapter01.model.ModelDuck;
import root.chapter01.tool.DuckPager;

public class StrategyPattern {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        System.out.println("--------------------------------------------------");

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("--------------------------------------------------");

        DuckPager duckPager = new DuckPager(new Squeak());
        duckPager.sound();
    }
}
