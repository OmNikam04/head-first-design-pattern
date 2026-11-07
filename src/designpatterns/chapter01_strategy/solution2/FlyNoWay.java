package designpatterns.chapter01_strategy.solution2;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("No way this ducky can fly");
    }
}
