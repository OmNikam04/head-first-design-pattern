package designpatterns.chapter01_strategy.solution2;

public class Squeak implements QuakBehaviour{
    @Override
    public void quak() {
        System.out.println("Duck says- squeak squeak");
    }
}
