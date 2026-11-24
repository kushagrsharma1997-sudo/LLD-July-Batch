package DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.fly;

public class FlyWithWings implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Flies using wings!");
    }
}
