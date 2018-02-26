package app.models.participants;

import app.models.Config;

public class Necromancer extends AbstractHero {
    public Necromancer() {
        super();
        super.setDexterity(Config.NECROMANCER_BASE_DEXTERITY);
        super.setStrength(Config.NECROMANCER_BASE_STRENGTH);
        super.setIntelligence(Config.NECROMANCER_BASE_INTELLIGENCE);
    }

    @Override
    public double getDamage() {
        return (this.getIntelligence() * 2) + (this.getStrength() * 2) + (this.getDexterity() * 2);
    }
}
