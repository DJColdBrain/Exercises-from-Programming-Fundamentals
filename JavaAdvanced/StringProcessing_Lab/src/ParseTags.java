import java.util.Scanner;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();



        while (text.contains("<upcase>")){
            int startIndex = text.indexOf("<upcase>") + 7;
            int lastIndex = text.indexOf("</upcase>");
            String textToUpper = text.substring(startIndex, lastIndex);

            text = text.replaceFirst(textToUpper, textToUpper.toUpperCase());
            text = text.replaceFirst("<upcase>", "");
            text = text.replaceFirst("</upcase>", "");

        }
        System.out.println(text);
    }
}
