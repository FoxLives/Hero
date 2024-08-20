package main;

import enemy.Enemy;
import heroes.Archer;
import heroes.Mage;
import heroes.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BattleGround {
    private static List<Creature> stackOfHeroes = new ArrayList<>();
    private static List<Creature> stackOfEnemies = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        // Добавление героев
        stackOfHeroes.add(new Warrior("Boge", 250));
        stackOfHeroes.add(new Archer("Hugu", 200));
        stackOfHeroes.add(new Mage("Boris", 150));

        // Добавление врагов
        for (int i = 0; i < 2; i++) {
            stackOfEnemies.add(new Enemy("Enemy_" + i, 200));
        }

        // Основной цикл боя
        while (!stackOfEnemies.isEmpty() && !stackOfHeroes.isEmpty()) {
            heroesAttack(stackOfHeroes, stackOfEnemies);
            heroesAttack(stackOfEnemies, stackOfHeroes);
        }

        // Определение победителя
        if (stackOfEnemies.isEmpty()) {
            ConsoleHelper.writeMessage("Heroes win!");
        } else {
            ConsoleHelper.writeMessage("Enemies win!");
        }
    }

    public static void heroesAttack(List<Creature> attackers, List<Creature> attacked) {
        Iterator<Creature> creatureIterator = attackers.iterator();
        while (creatureIterator.hasNext()) {
            Creature creature = creatureIterator.next();
            if (creature.isAlive()) {
                if (!attacked.isEmpty()) {
                    Creature attackedEnemy = attacked.get(random.nextInt(attacked.size()));
                    creature.attackEnemy(attackedEnemy);
                    ConsoleHelper.writeMessage("У " + attackedEnemy.getName() + " осталось " + attackedEnemy.getHealth() + " здоровья.");
                }
            } else {
                creatureIterator.remove();
                ConsoleHelper.writeMessage(creature.getName() + ": Is Dead!");
            }
        }
    }
}
