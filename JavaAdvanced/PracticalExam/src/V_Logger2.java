import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class V_Logger2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> users = new ArrayList<>();
//        Map<String, List<Integer>> followers = new TreeMap<>();
        Map<String, Tlogger> vloggers = new LinkedHashMap<>();


        while (true) {
            String[] commands = reader.readLine().split("\\s+");
            if (commands[0].equals("Statistics")) {
                break;
            }
            String user = commands[0];
            String command = commands[1];
            String follower = commands[2];

            switch (command) {
                case "joined":
                    if (vloggers.containsKey(user)) {
                        break;
                    } else {
                        users.add(user);
//                        List<Integer> data = new ArrayList<>();
//                        data.add(0);
//                        data.add(0);
//                        followers.put(user, data);

                        vloggers.put(user, new Tlogger(user));
                    }
                    break;
                case "followed":
                    if (user.equals(follower)) {
                        break;
                    }
                    boolean s = false;
                    for (Tlogger vlogger : vloggers.values()) {
                        if (vlogger.getName().equals(user)){
                            for (String s1 : vlogger.getFollowing()) {
                                if (s1.contains(follower)) {
                                    s = true;
                                }
                            }
                        }
                    }
                    if (s) {
                        break;
                    }

                    if (users.contains(user) && users.contains(follower)) {
//                        List<Integer> data = new ArrayList<>();
//                        if (followers.containsKey(follower)) {
//                            data.add(0, followers.get(follower).get(0) + 1);
//                            data.add(1, followers.get(follower).get(1));
//                        }
//                        followers.put(follower, data);
                        vloggers.get(follower).addFollower(user);
                        vloggers.get(user).addFollowing(follower);
//                        data = new ArrayList<>();
//                        if (followers.containsKey(follower)) {
//                            data.add(0, followers.get(user).get(0));
//                            data.add(1, followers.get(user).get(1) + 1);
                        }
//                        followers.put(user, data);
                    }


            }



        Comparator<Map.Entry<String, Tlogger>> comparator = (x, y) ->{
//          if (x.getValue().getFollowers().size() != y.getValue().getFollowers().size()){
//              return Integer.compare(x.getValue().getFollowing().size(),y.getValue().getFollowing().size());
//          }
            return Integer.compare(x.getValue().getFollowers().size(),y.getValue().getFollowers().size());

        };

//        followers = followers.entrySet().stream().sorted(comparator).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
        vloggers = vloggers.entrySet().stream().sorted(comparator).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));

        System.out.println("The V-Logger has a total of "+ vloggers.size() + " vloggers in its logs.");
        int n = 1;


        for (Map.Entry<String, Tlogger> entry : vloggers.entrySet()) {
            System.out.printf("%d. %s : %d followers, %d following%n", n, entry.getValue().getName(),
                    entry.getValue().getFollowersNumber(), entry.getValue().getFolloweingNumber());
            if (n == 1){
                for (String s  : entry.getValue().getFollowers()) {
                        System.out.println("*  " + s);
                }
            }

            n++;
        }
    }



}


class Tlogger{
    private String name;

    private ArrayList<String> followers = new ArrayList<>();

    private ArrayList<String> following = new ArrayList<>();

    private int followeingNumber;
    private int followersNumber;

    public Tlogger(String name){
        this.name = name;
        this.followersNumber = 0;
        this.followeingNumber = 0;
    }

    public void addFollower(String username){
        followers.add(username);
        followersNumber++;
    }
    public void addFollowing(String username){
        following.add(username);
        followeingNumber++;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getFollowers() {
        return followers;
    }

    public ArrayList<String> getFollowing() {
        return following;
    }

    public int getFolloweingNumber() {
        return followeingNumber;
    }

    public int getFollowersNumber() {
        return followersNumber;
    }
}
