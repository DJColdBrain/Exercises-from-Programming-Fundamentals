package logger.loggers;

import logger.LogType;
import logger.interfaces.Handler;

public class EventLogger extends Logger {

    private Handler successor;

    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.EVENT){
            System.out.println(type.name() + ": " + message);
        }else {
            if (super.getSuccessor() != null) {
                super.getSuccessor().handle(type, message);
            }
        }
    }


}
