package app.models.participants;

import app.contracts.Targetable;
import app.models.Config;

public class Boss implements Targetable {

    private double damage;
    private String name;
    private double health;
    private double gold;
    private boolean isAlive;
    private int level;

    public Boss() {
        level = 1;
        isAlive = true;
        setHealth(Config.BOSS_HEALTH);
        this.damage = Config.BOSS_DAMAGE;
        setGold(Config.BOSS_GOLD);
    }


    @Override
    public double getDamage() {
        return this.damage;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Class: Boss\n" +
                "    Health: %.2f | Damage: %.2f | %.2f Gold”\n", this.getName(), getHealth(), getDamage(), getGold() );
    }

    public void levelUp(){
        level++;
        setHealth(Config.BOSS_HEALTH);
    }




    @Override
    public String attack(Targetable target) {
        if (!this.isAlive()) {
            return this.getName() + " is dead! Cannot attack.";
        }

        if (!target.isAlive()){
            return target.getName() + " is dead! Cannot be attacked.";
        }

        target.takeDamage(this.getDamage());

        String result = this.getName() + " attacked!";
        if (!target.isAlive()) {
            this.levelUp();
            target.giveReward(this);
            result += String.format(" %s has been slain by %s.", target.getName(), this.getName());
        }

        return result;
    }

    protected void setGold(double gold){
        this.gold = gold;
    }


    @Override
    public void takeDamage(double damage) {
        this.setHealth(this.getHealth() - damage);
        if (this.getHealth() <= 0){
            this.isAlive = false;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getGold() {
        return this.gold;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public void giveReward(Targetable targetable) {
        targetable.receiveReward(getGold());
    }

    @Override
    public void receiveReward(double reward) {
        this.gold += reward;
    }


    @Override
    public boolean isAlive() {
        return this.isAlive;
    }
}
