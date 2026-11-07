package designpatterns.chapter01_strategy;

public class MallardDuck extends Duck implements Flyable{
    void display(){
        System.out.println("Display called from MallardDuck");
    }


    @Override
    public void fly() {
        System.out.println("Flying like mallard");
    }
}
