package designpatterns.chapter01_strategy.solution2;

public class Quak implements QuakBehaviour{
    @Override
    public void quak() {
        System.out.println("Duck says - Quak quak");
    }
}
