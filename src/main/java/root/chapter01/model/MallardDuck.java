package root.chapter01.model;

import root.chapter01.behavior.fly.FlyWithWings;
import root.chapter01.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior  = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck.");
    }
}
