package DesignPatterns.StrategyDesignPattern.strategyDemo;

import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.attack.BowAttack;
import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.attack.MagicAttack;
import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.attack.SwordAttack;
import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.fly.FlyNoWay;
import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.fly.FlyWithJet;
import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.fly.FlyWithWings;
import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.type.AssassinType;
import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.type.KnightType;
import DesignPatterns.StrategyDesignPattern.strategyDemo.strategies.type.WarriorType;


public class Main {
public static void main(String[] args) {

        // Alex begins as a Warrior, using a sword, without the ability to fly.
        Player alex = new Player("Alex", new SwordAttack(),
                new FlyNoWay(), new WarriorType());

        System.out.println("--- Level 1: Starting character ---");
        alex.showStatus();
        alex.attack();
        alex.fly();

        // Same player, new weapon and a jetpack.
        System.out.println("\n--- Level 2: Equipment upgrade ---");
        alex.setAttackStrategy(new BowAttack());
        alex.setFlyStrategy(new FlyWithJet());

        alex.showStatus();
        alex.attack();
        alex.fly();

        // Same player, new character mode and wings.
        System.out.println("\n--- Level 3: Change combat type ---");
        alex.setTypeStrategy(new AssassinType());
        alex.setFlyStrategy(new FlyWithWings());

        alex.showStatus();
        alex.attack();
        alex.fly();

        // Demonstrate the last type and attack strategy.
        System.out.println("\n--- Level 4: Knight mode ---");
        alex.setTypeStrategy(new KnightType());
        alex.setAttackStrategy(new MagicAttack());
        alex.setFlyStrategy(new FlyNoWay());

        alex.showStatus();
        alex.attack();
        alex.fly();
    }
}
