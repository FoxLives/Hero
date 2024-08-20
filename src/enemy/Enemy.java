package enemy;

import main.ConsoleHelper;
import main.Creature;

public class Enemy extends Creature {
    public Enemy(String name, double health) {
        super(name, health);
    }

    public void attackEnemy(Creature hero) {
        ConsoleHelper.writeMessage("Враг атакует героя ледяным заклинанием");
        hero.takeDamage(50.0);
    }
}
