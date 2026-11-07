package designpatterns.chapter01_strategy;

public class RedheadDuck extends Duck implements Flyable{
    void display(){
        System.out.println("Display called from RedheadDuck");
    }
    public void fly(){
        System.out.println("Flying like redhead");
    }
}
