package root.chapter01.behavior.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Being flying.");
    }
}