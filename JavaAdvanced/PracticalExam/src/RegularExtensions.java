import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExtensions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder text =new StringBuilder(reader.readLine());

        while (true){


            String ungonePattern = reader.readLine();
            if (ungonePattern .equals( "Print")){
                break;
            }
            String[] pattern = ungonePattern.split("%");
            if (!ungonePattern.contains("%")){
                while (text.indexOf(pattern[0]) != -1){
                    int index = text.indexOf(pattern[0]);
                    String reversedText =new StringBuilder(pattern[0]).reverse().toString();
                    text = text.replace(index, index + pattern[0].length(),reversedText );
                }
            }else{
                String pattern1 = ungonePattern.replaceAll("%", "[\\\\S]*") ;
                if (pattern1.contains(".")){
                   pattern1 =  pattern1.replaceAll("\\.", "\\\\.");
                }
                Pattern pattern2 = Pattern.compile(pattern1);



                    Matcher matcher = pattern2.matcher(text);
                    while (matcher.find()){
                        String wors = matcher.group();
                        int index = text.indexOf(wors);
                        String reversedWord =new StringBuilder(wors).reverse().toString();
                        text = text.replace(index,index  + wors.length(), reversedWord);

                }

            }

        }
        System.out.print(text);
    }
}
