package designpatterns.chapter01_strategy.solution2;

public class MallardDuck extends Duck{
    MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quakBehaviour = new Squeak();
    }
}
