package logger.loggers;

import logger.LogType;

public class CombatLogger extends Logger {
    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ATTACK || type == LogType.MAGIC){
            System.out.println(type.name() + ": " + message);
        }else {
            if (super.getSuccessor() != null) {
                super.getSuccessor().handle(type, message);
            }
        }
    }

}
