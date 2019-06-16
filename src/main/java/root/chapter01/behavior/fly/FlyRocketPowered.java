package root.chapter01.behavior.fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Being flying with rocket thrust.");
    }
}
