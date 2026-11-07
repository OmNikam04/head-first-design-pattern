package designpatterns.chapter01_strategy.solution2;

public class MuteQuak implements QuakBehaviour{
    @Override
    public void quak() {
        System.out.println("duck is Silence");
    }
}
