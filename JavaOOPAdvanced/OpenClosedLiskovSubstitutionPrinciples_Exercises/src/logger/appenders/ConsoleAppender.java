package logger.appenders;

import logger.interfaceses.Appender;
import logger.interfaceses.Layout;

public class ConsoleAppender implements Appender{

    Layout layout;

    public ConsoleAppender(Layout layout) {
        this.layout = layout;
    }


    public String replaceLayout(String data, String message, String level){
        String output;
        output = layout.getLayout();
        output = output.replace("<time>", data);
        output = output.replace("<report>", level);
        output = output.replace("<message>", message);
        return output;
    }
    
}
