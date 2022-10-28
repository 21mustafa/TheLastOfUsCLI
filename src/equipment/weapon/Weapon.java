package src.equipment.weapon;

import src.Console;
import src.character.Character;
import src.character.Human;
import src.equipment.Equipment;

public class Weapon extends Equipment {
    private String name;
    private int damage;
    private int ammo;

    public Weapon(String name, int damage, int ammo) {
        this.name = name;
        this.ammo = ammo;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return -1 * this.damage;
    }

    public int getAmmo() {
        return this.ammo;
    }

    public void useWeapon(Character character) {
        this.ammo = this.ammo - 1;
        character.updateHP(this.getDamage());
    }

    @Override
    public void getItem(Human character) {
        character.setWeapon(this);
    }

    public void printEquipmentInfo() {
        Console.logWithDelay("You found a " + this.name + ".\n\tAmmo: " + this.ammo + "\n\tStrength: " + this.damage);
    }
}
