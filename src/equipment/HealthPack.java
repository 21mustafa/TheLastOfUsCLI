package src.equipment;

import src.Console;
import src.character.Human;

public class HealthPack extends Equipment {
    private int hp = 45;

    @Override
    public void getItem(Human character) {
        character.updateHP(this.hp);
    }

    @Override
    public void printEquipmentInfo() {
        Console.logWithLongDelay("You found a health Pack: +" + this.hp);
    }

    @Override
    public void encounter(Human character) {
        this.printEquipmentInfo();
        this.getItem(character);
        character.printCharacterInfo();
    }
}
