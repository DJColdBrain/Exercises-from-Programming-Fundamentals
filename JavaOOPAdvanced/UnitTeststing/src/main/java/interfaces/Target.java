package interfaces;

public interface Target {

    void takeAttack(int AttackPoints);

    int getHealth();

    int giveExperience();

    boolean isDead();
}
