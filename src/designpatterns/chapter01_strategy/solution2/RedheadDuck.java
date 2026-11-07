package designpatterns.chapter01_strategy.solution2;

public class RedheadDuck extends Duck{
    RedheadDuck(){
        flyBehaviour = new FlyWithWings();
        quakBehaviour = new Quak();
    }
}
