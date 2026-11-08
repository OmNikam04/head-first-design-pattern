package designpatterns.chapter01_strategy.solution2;

// Duck is our context class - Duck holds the instance variables(flybehaviour, quakbehaviour)
public class Duck {
    QuakBehaviour quakBehaviour;
    FlyBehaviour flyBehaviour;

    void display(){
        System.out.println("display called from Duck");
    }

    // Its always better to use setter methods for instance variables
    public void setFlyBehaviour(FlyBehaviour fb){
        this.flyBehaviour = fb;
    }

    void performFly(){
        flyBehaviour.fly();
    }

    public void setQuakBehaviour(QuakBehaviour qb){
        this.quakBehaviour = qb;
    }

    void performQuak(){
        quakBehaviour.quak();
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
