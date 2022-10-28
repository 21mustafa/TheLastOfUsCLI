package src.character.Infected;

import src.character.Character;

public class Walker extends Infected {
    public Walker() {
        super("Walker", 5, 40);
    }

    @Override
    public void onDead(Character enemy) {
        return;
    }
}
