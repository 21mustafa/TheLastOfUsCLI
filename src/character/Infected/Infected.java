package src.character.Infected;

import src.Console;
import src.character.Character;

public abstract class Infected extends Character {
    private int damage;

    public Infected(String name, int damage, int hp) {
        super(name, hp);
        this.damage = damage;
    }

    public abstract void onDead(Character enemy);

    @Override
    public void attack(Character enemy) {
        Console.logWithLongDelay("\n" + this.getName() + " attacks. ");
        enemy.updateHP(getDamage());
    }

    public int getDamage() {
        return -1 * this.damage;
    }

    public void printCharacterInfo() {
        if (this.getHP() > 0) {
            System.out.println(
                    this.getName() + "\n\tHP: " + this.getHP() + "\n\tStrength: " + (this.getDamage() * -1) + "\n");
        }

    }
}
