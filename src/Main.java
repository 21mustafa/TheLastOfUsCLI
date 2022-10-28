package src;

import src.character.Human;
import src.character.Infected.Infected;
import src.character.Infected.RatKing;
import src.character.Infected.Shambler;
import src.character.Infected.Walker;
import src.equipment.Equipment;
import src.equipment.EquipmentGenerator;
import src.equipment.weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        Console.log("Welcome to the world of deads.");
        Console.logWithDelay("You are the only living person left.");
        Console.logWithDelay("Are you ready...");
        Console.logWithDelay("...to survive? (y/n)");

        boolean answer = Console.getInput("Let's begin...", "Scared? Come back when you are ready.");
        if (!answer)
            return;

        Console.log("Enter your name");
        String name = System.console().readLine();
        Human mainCharacter = new Human(name, 100);

        EquipmentGenerator equipmentGenerator = new EquipmentGenerator();
        Score score = new Score();

        boolean result = true;
        while (result) {
            Console.logWithDelay("\nDo you want to add a weapon? (y/n)");
            result = Console.getInput("Weapon:", "Fine...\n");
            if (result) {
                try {
                    Console.log("Enter the weapon name: ");
                    String weaponName = System.console().readLine();

                    Console.log("Enter the damage: ");
                    String damageStr = System.console().readLine();
                    int damage = Integer.parseInt(damageStr);
                    if (damage <= 0) {
                        Console.log("Damage must be a positive number.");
                    }

                    Console.log("Enter the ammo: ");
                    String ammoStr = System.console().readLine();
                    int ammo = Integer.parseInt(ammoStr);
                    if (ammo <= 0) {
                        Console.log("Ammo must be a positive number.");
                    }

                    Weapon newWeapon = new Weapon(weaponName, damage, ammo);
                    equipmentGenerator.addToTheEquipments(newWeapon);
                    Console.log("Done! \n");

                } catch (NumberFormatException nfe) {
                    Console.log("Invalid entry!");
                    return;
                }
            }
        }

        Console.logWithDelay("\n-------------------\nEPISODE 1: Hope\n-------------------");
        Console.logWithDelay("You found a map. There is a facility circled in.");
        Console.logWithDelay("Maybe a safe zone? They may have supplies that you deseperatly need.");
        Console.logWithDelay("It's pretty close. Worth to try...");
        Console.logWithDelay("Be careful! The road is full of infecteds.\n");

        Equipment equipment1 = equipmentGenerator.getEquipment(2);
        equipment1.encounter(mainCharacter);

        Infected walker = new Walker();
        Fight.start(walker, mainCharacter, score);

        Equipment equipment2 = equipmentGenerator.getEquipment(0);
        equipment2.encounter(mainCharacter);

        Infected shambler = new Shambler();
        Fight.start(shambler, mainCharacter, score);

        Console.logWithDelay("Congrats! You arrived to the destination.");
        Console.logWithDelay("It's a mall.");
        Console.logWithDelay("You enter...");
        Console.logWithDelay("It seems abandoned.\n");

        Equipment equipment3 = equipmentGenerator.getEquipment(1);
        equipment3.encounter(mainCharacter);

        Console.logWithDelay("You heard a noise!");
        Console.logWithDelay("Here it comes!!");

        Infected boss = new RatKing();
        Fight.start(boss, mainCharacter, score);

        Console.logWithDelay("You hear something again...");
        Console.logWithDelay("Is there somebody in here??");
        Console.logWithDelay("To be continued...");
    }
}
