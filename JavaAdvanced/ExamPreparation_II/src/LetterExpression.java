    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class LetterExpression {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String s = reader.readLine();
            Pattern patternDigits = Pattern.compile("([\\d]+)");
            Pattern patternLetters = Pattern.compile("([\\D]+)");

            float firstDigit;

            Matcher matcherDigits  = patternDigits.matcher(s);
            Matcher matcherLetters  = patternLetters.matcher(s);
            if (matcherDigits.find()) {
                firstDigit = Float.parseFloat(matcherDigits.group());
                String letters;
                float result = 0;
                result += firstDigit;
                while (matcherDigits.find()) {
                    matcherLetters.find();
                    letters = matcherLetters.group();
                    float nextDigit = Float.parseFloat(matcherDigits.group());
                    if (letters.length() % 2 == 0) {
                        result += nextDigit;
                    } else {
                        result -= nextDigit;
                    }

                }
                System.out.print((int) result);
            }else{
                System.out.print(0);
            }
        }
    }
