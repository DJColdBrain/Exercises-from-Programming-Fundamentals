package logger;

import logger.commands.AttackCommand;
import logger.commands.GroupAttackCommand;
import logger.commands.GroupTargetCommand;
import logger.commands.TargetCommand;
import logger.executors.CommandExecutor;
import logger.interfaces.*;
import logger.loggers.CombatLogger;
import logger.loggers.EventLogger;

public class Main {
    public static void main(String[] args) {
        Handler combatLogger = new CombatLogger();
        Handler eventLogger = new EventLogger();

        combatLogger.setSuccessor(eventLogger);

        CommandExecutor executor = new CommandExecutor();

        Attacker worrior1 = new Warrior("Pesho1", 22, combatLogger);
        Attacker worrior2 = new Warrior("Pesho2", 22, combatLogger);
        Attacker worrior3 = new Warrior("Pesho3", 22, combatLogger);
        Attacker worrior4 = new Warrior("Pesho4", 22, combatLogger);
        Attacker worrior5 = new Warrior("Pesho5", 22, combatLogger);
        Target dragon = new Dragon("Gosho", 55, 5, combatLogger);

        AttackGroup group = new Group();
        group.addMember(worrior1);
        group.addMember(worrior2);
        group.addMember(worrior3);
        group.addMember(worrior4);
        group.addMember(worrior5);

        dragon.register(worrior1);
        dragon.register(worrior2);
        dragon.register(worrior3);
        dragon.register(worrior4);
        dragon.register(worrior5);

        Command groupTargetCommand = new GroupTargetCommand(group, dragon);
        Command groupAttackCommand = new GroupAttackCommand(group);
       // worrior.setTarget(dragon);
       // worrior.attack();
        executor.executeCommand(groupTargetCommand);
        executor.executeCommand(groupAttackCommand);


    }



}
