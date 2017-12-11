package logger.loggers;

import logger.interfaces.Handler;

public abstract class Logger implements Handler{


    private Handler successor;

    protected Handler getSuccessor(){
        return  this.successor;
    }

    @Override
    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

}
