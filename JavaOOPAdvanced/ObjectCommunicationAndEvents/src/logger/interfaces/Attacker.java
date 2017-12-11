package logger.interfaces;

public interface Attacker extends Observer{
    void attack();
    void setTarget(Target target);
}
