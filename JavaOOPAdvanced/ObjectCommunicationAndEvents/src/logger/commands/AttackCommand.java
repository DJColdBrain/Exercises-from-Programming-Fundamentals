package logger.commands;

import logger.interfaces.Attacker;
import logger.interfaces.Command;

public class AttackCommand implements Command{

    private Attacker attacker;

    public AttackCommand(Attacker attacker) {
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        attacker.attack();
    }
}
