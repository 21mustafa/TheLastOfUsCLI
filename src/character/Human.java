package src.character;

import src.Console;
import src.Score;
import src.equipment.weapon.Knife;
import src.equipment.weapon.Weapon;

public class Human extends Character {
    private Weapon currentWeapon;

    public Human(String name, int hp) {
        super(name, 100);
        this.currentWeapon = new Knife();
    }

    @Override
    public void attack(Character enemy) {
        Console.logWithLongDelay("\nYou attack.");
        currentWeapon.useWeapon(enemy);
        if (currentWeapon.getAmmo() == 0) {
            Console.logWithLongDelay("You ran out of ammo! Switched to knife.");
            this.currentWeapon = new Knife();
        }
    }

    public Weapon getWeapon() {
        return this.currentWeapon;
    }

    public void setWeapon(Weapon weapon) {
        this.currentWeapon = weapon;
    }

    public void printWeaponInformation() {
        System.out.println("Your current weapon:");
        this.currentWeapon.printEquipmentInfo();
    }

    public void printCharacterInfo() {
        System.out.println(this.getName());
        System.out.println("\tHP: " + this.getHP() + "\n");
    }

    public void onKilled(Score score) {
        Console.log("You died.");
        Console.log("\n------------------------\n");
        Console.logWithDelay("In the memory of " + this.getName());
        score.printScore();
        System.exit(0);
    }
}
