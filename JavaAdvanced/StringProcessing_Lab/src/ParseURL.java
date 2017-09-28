import java.util.Scanner;

public class ParseURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        String protocol;
        String server;
        String recource;
        if (url.contains("://")){
            protocol = url.substring(0, url.indexOf("://"));
            url = url.replace(protocol+ "://", "");
            if (url.contains("/") && !url.contains("://")){
                server = url.substring(0, url.indexOf("/"));
                url = url.replace(server+"/", "");

                    recource = url;

                    System.out.println("Protocol = " + protocol);
                    System.out.println("Server = " + server);
                    System.out.println("Resources = " + recource);


            }else{
                System.out.println("Invalid URL");
            }
        }else{
            System.out.println("Invalid URL");
        }

    }
}
