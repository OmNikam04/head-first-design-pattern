package designpatterns.chapter01_strategy.solution2;

public class MallardDuck extends Duck{
    MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quakBehaviour = new Squeak();
    }

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuak();
    }
}
