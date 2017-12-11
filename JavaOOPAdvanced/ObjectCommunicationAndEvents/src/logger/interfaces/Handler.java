package logger.interfaces;

import logger.LogType;

public interface Handler {
    void handle(LogType type, String s);
    void setSuccessor(Handler handler);
}
