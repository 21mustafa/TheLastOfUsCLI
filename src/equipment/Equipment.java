package src.equipment;

import src.Console;
import src.character.Human;

public abstract class Equipment {
    public void encounter(Human character) {
        this.printEquipmentInfo();
        Console.log("Do you want to take it? (y/n)");
        boolean answer = Console.getInput("You took the item\n", "You left it behind.\n");
        if (answer) {
            this.getItem(character);
        }
    }

    public abstract void getItem(Human character);

    public abstract void printEquipmentInfo();
}
