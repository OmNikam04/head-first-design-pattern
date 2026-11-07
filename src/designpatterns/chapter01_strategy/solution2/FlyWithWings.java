package designpatterns.chapter01_strategy.solution2;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
