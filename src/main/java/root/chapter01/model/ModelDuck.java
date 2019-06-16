package root.chapter01.model;

import root.chapter01.behavior.fly.FlyNoWay;
import root.chapter01.behavior.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model duck.");
    }
}
