package logger.interfaces;

public interface Target extends Subject {
    void receiveDamage(int dmg);
    boolean isDead();
}