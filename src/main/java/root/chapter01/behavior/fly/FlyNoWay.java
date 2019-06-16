package root.chapter01.behavior.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Not being flying.");
    }
}
