package logger.commands;

import logger.interfaces.Attacker;
import logger.interfaces.Command;
import logger.interfaces.Target;

public class TargetCommand implements Command {

    private Attacker attacker;
    private Target target;

    public TargetCommand(Attacker attacker, Target target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        attacker.setTarget(target);
    }
}
