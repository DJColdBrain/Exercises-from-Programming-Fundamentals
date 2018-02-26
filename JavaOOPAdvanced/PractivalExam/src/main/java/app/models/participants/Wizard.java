package app.models.participants;

import app.models.Config;

public class Wizard extends AbstractHero {
    public Wizard() {
        super();
        super.setDexterity(Config.WIZARD_BASE_DEXTERITY);
        super.setStrength(Config.WIZARD_BASE_STRENGTH);
        super.setIntelligence(Config.WIZARD_BASE_INTELLIGENCE);
    }

    @Override
    public double getDamage() {
        return (this.getIntelligence() * 5) + this.getDexterity();
    }
}
