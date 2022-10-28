package src.equipment.weapon;

import src.Console;

public class Knife extends Weapon {
    public Knife() {
        super("Knife", 2, Integer.MAX_VALUE);
    }

    public void printEquipmentInfo() {
        Console.logWithDelay("You found a " + this.getName() + ".\n\tStrength: " + (this.getDamage() * -1));
    }
}
