package designpatterns.chapter01_strategy;

public class Duck {

    void display(){
        System.out.println("Display called from Duck");
    }

    void swim(){
        System.out.println("Swim called from Duck");
    }

    public static void main(String[] args){
        Duck duck = new MallardDuck();
        duck.display();// calls MallardDuck display method

        Duck duck1 = new RedheadDuck();
        duck1.display();// calls RedheadDuck display method

        ((RedheadDuck) duck1).fly();

        ((MallardDuck) duck).fly();
    }
}
