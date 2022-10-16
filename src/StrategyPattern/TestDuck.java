package StrategyPattern;

public class  TestDuck extends Duck {
        public TestDuck() {
            flyBehavior = new FlyWithWing();
            quackBehavior = new Quack();
        }

        public void display() {
            System.out.println("tôi là vịt test");
        }
    }

