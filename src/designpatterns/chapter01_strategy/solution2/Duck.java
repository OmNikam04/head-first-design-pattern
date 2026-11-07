package designpatterns.chapter01_strategy.solution2;

public class Duck {
    QuakBehaviour quakBehaviour;
    FlyBehaviour flyBehaviour;

    void display(){
        System.out.println("display called from Duck");
    }

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.flyBehaviour.fly();// Flying with wings
        mallardDuck.quakBehaviour.quak();// Duck says- squeak squeak

        Duck rubberDuck = new RubberDuck();
        rubberDuck.quakBehaviour.quak();// duck is Silence
        rubberDuck.flyBehaviour.fly();// No way this ducky can fly

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.flyBehaviour.fly();// Flying with wings
        redheadDuck.quakBehaviour.quak();// Duck says - Quak quak
    }
}
