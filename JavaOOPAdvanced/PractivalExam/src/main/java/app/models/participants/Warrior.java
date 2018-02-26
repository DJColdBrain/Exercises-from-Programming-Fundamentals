package app.models.participants;

import app.models.Config;

public class Warrior extends AbstractHero {


    public Warrior() {
        super();
        super.setDexterity(Config.WARRIOR_BASE_DEXTERITY);
        super.setStrength(Config.WARRIOR_BASE_STRENGTH);
        super.setIntelligence(Config.WARRIOR_BASE_INTELLIGENCE);
    }

    @Override
    public double getDamage() {
            return (this.getStrength() * 2) + this.getDexterity();
    }
}
