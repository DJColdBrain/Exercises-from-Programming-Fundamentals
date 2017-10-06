import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<String > guestListRegular = new TreeSet<>();


        while (true){
            String s = reader.readLine();

            if (s.equals("PARTY")){
                break;
            }
            if (s.length() > 8 || s.length() < 8){
                continue;
            }


                guestListRegular.add(s);

        }
        while (true){
            String s = reader.readLine();

            if (s.equals("END")){
                break;
            }


            guestListRegular.remove(s);

        }

        System.out.println(guestListRegular.size());

        for (String s : guestListRegular) {
            System.out.println(s);
        }
    }
}
