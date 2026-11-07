package designpatterns.chapter01_strategy.solution1;

public class RedheadDuck extends Duck implements Flyable {
    void display(){
        System.out.println("Display called from RedheadDuck");
    }
    public void fly(){
        // DUPLICATED CODE
        System.out.println("Flying like redhead");
    }
}
