package src.character.Infected;

import src.character.Character;

public class Shambler extends Infected {
    public Shambler() {
        super("Shambler", 30, 120);
    }

    @Override
    public void onDead(Character enemy) {
        this.attack(enemy);
        System.out.println("Oh no! It spreat poisonous spores!!");
        enemy.printCharacterInfo();
    }
}
