package heroes;

import main.ConsoleHelper;
import main.Creature;

public class Warrior extends Hero {
    public Warrior(String name, double health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Creature enemy) {
        ConsoleHelper.writeMessage("Герой атакует врага буловой");
        enemy.takeDamage(10.0);
    }
}
