package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.display();

        Duck Test1 = new TestDuck();
        Test1.performFly();
        Test1.performQuack();
        Test1.display();
    }
}
