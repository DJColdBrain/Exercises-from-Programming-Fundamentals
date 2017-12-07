package logger.layouts;

public class SimpleLayout  {

    private String layout;

    public SimpleLayout() {
        this.layout = "<time> - <report> - <message>";
    }


    public String getLayout() {
        return this.layout;
    }
}
