import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class FootballStats {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Match> matches = new ArrayList<>();
        while (true){

            String[] arguments = reader.readLine().split(" ");
            if (arguments[0].equals("Season")){
                break;
            }
            String homeTeamName = arguments[0];
            String awayTeamName = arguments[2];
            String goals = arguments[4];
            int homeGoal = Integer.parseInt(goals.split(":")[0]);
            int awayGoal = Integer.parseInt(goals.split(":")[1]);

            Match match = new Match(homeTeamName, awayTeamName, homeGoal, awayGoal);
            matches.add(match);
            match = new Match(awayTeamName, homeTeamName, awayGoal, homeGoal);
            matches.add(match);
            }
            List<String> teams = Arrays.stream(reader.readLine().split(", ")).collect(Collectors.toList());
            matches = matches.stream().sorted(Match::compareTo).collect(Collectors.toList());
        for (int i = 0; i < teams.size(); i++) {
            String name = teams.get(i);
            for (Match match : matches) {
                if (match.getHomeName().equals(name)){
                    System.out.printf("%s - %s -> %d:%d%n", match.getHomeName(), match.getAwayName(), match.getHomeScore(), match.getAwayScore());

                }
            }
        }

        }
}

    class Match{

    private String homeName;
    private String awayName;
    private int homeScore;
    private int awayScore;

    public Match(String homeName, String awayName, int homeScore, int awayScore){
        this.homeName = homeName;
        this.awayName = awayName;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }



        public String getHomeName() {
            return homeName;
        }

        public String getAwayName() {
            return awayName;
        }

        public int getHomeScore() {
            return homeScore;
        }

        public int getAwayScore() {
            return awayScore;
        }


        public int compareTo(Match o) {
            return Integer.compare(this.awayName.charAt(0), o.awayName.charAt(0));
        }
    }



