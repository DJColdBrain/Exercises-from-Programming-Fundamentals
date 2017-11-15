package Тelephony;

public class Smartphone implements Calling, Browsing {

    @Override
    public String browse(String url) {
        char[] urlDigits = url.toCharArray();
        for (char digit : urlDigits) {
            if (Character.isDigit(digit)){
                return "Invalid URL!";
            }
        }
        return "Browsing: " + url + "!";
    }

    @Override
    public String call(String number) {
        char[] digits = number.toCharArray();
        for (char digit : digits) {
            if (!Character.isDigit(digit)){
                return "Invalid number!";
            }
        }
        return "Calling... " + number;
    }
}
