package logger.interfaceses;


public interface Appender {

    String replaceLayout(String data, String message, String level);
}
