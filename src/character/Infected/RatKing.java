package src.character.Infected;

import src.character.Character;

public class RatKing extends Infected {
    public RatKing() {
        super("RatKing", 90, 200);
    }

    @Override
    public void onDead(Character enemy) {
        return;
    }
}
