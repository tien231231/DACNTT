package StrategyPattern;

public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Bay bằng cánh");
    }

}