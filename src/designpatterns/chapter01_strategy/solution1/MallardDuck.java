package designpatterns.chapter01_strategy.solution1;

public class MallardDuck extends Duck implements Flyable{
    void display(){
        System.out.println("Display called from MallardDuck");
    }

    @Override
    public void fly() {
        // DUPLICATED CODE
        System.out.println("Flying like mallard");
    }
}
