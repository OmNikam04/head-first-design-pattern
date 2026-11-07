package designpatterns.chapter01_strategy.solution2;

public class RubberDuck extends Duck{
    RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quakBehaviour = new MuteQuak();
    }
    void display(){
        System.out.println("Display called from Rubberduck");
    }
}
