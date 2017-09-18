import java.util.Scanner;

public class p16_URL_Parser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        String protocol ="";
        if (url.contains("://")) {
            protocol = url.substring(0, url.indexOf("://"));
            url = url.substring(protocol.length() + 3);
        }
        String server;
        String resource = "";
        if (url.contains("/")) {
            server = url.substring(0, url.indexOf("/"));
            resource = url.substring(server.length() + 1);
        } else {
            server = url;
        }

        System.out.printf("[protocol] = \"%s\"%n", protocol);
        System.out.printf("[server] = \"%s\"%n", server);
        System.out.printf("[resource] = \"%s\"%n", resource);
    }
}
