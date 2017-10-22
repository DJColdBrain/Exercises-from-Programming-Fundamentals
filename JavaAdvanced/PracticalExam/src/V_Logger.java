import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class V_Logger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> users = new TreeMap<>();
        Map<String, Deque<Integer>> followers = new TreeMap<>();
        List<Vlogger> vloggers = new ArrayList<>();



        while (true){
            String[] commands = reader.readLine().split("\\s+");
            if (commands[0].equals("Statistics")){
                break;
            }
            String user = commands[0];
            String command = commands[1];
            String follower = commands[2];

            switch (command){
                case "joined":
                    if (users.containsKey(user)){
                        break;
                    }else{
                        users.put(user,0);
                        Deque<Integer> data = new ArrayDeque<>();
                        data.offerFirst(0);
                        data.offerLast(0);
                        followers.put(user, data);
                    }
                    break;
                case "followed":
                    if (user.equals(follower)){
                        break;
                    }
                    boolean s = false;
                    for (Vlogger vlogger : vloggers) {
                        if (vlogger.getName().contains(follower)){
                            if (vlogger.getFollowerName().equals(user)){
                                s =true;
                            }
                        }
                    }
                    if (s){
                        break;
                    }

                    if (users.containsKey(user) && users.containsKey(follower) ){
                        Deque<Integer> data = new ArrayDeque<>();
                        if (followers.containsKey(follower)){
                            data.offerFirst( followers.get(follower).pollFirst() + 1);
                            data.offerLast( followers.get(follower).pollLast());
                        }
                       followers.put(follower, data);
                        vloggers.add(new Vlogger(follower, user));
                        data = new ArrayDeque<>();
                        if (followers.containsKey(follower)){
                            data.offerFirst( followers.get(user).pollFirst());
                            data.offerLast( followers.get(user).pollLast() +1);
                        }
                        followers.put(user, data);
                    }


                    break;
            }

        }
        Comparator<Map.Entry<String, Deque<Integer>>> entryComparator = Comparator.comparing(
                c -> c.getValue().peekLast());

        for (Map.Entry<String, Deque<Integer>> entry : followers.entrySet()) {
            users.put(entry.getKey(), entry.getValue().peekFirst());
        }

        TreeMap<String, Integer> sss = new TreeMap<>();

        users.entrySet().stream().sorted((a,b) -> b.getValue().compareTo(a.getValue())).forEach(e -> sss.put(e.getKey(),e.getValue() ));
        vloggers = vloggers.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());



        System.out.println("The V-Logger has a total of "+ users.size() + " vloggers in its logs.");
        int n = 1;
        int k = sss.size();
        for (int j = 0; j< k; j++) {
             Deque<Integer> stringDequeEntry = followers.get(sss.lastKey());

            System.out.printf("%d. %s : %d followers, %d following%n", n, sss.lastKey(), stringDequeEntry.peekFirst()
                    , stringDequeEntry.peekLast());
            if (n == 1){
                for (Vlogger vlogger : vloggers) {
                    if (vlogger.getName().equals(sss.lastKey())){
                        System.out.println("* " + vlogger.getFollowerName());
                    }
                }
            }
            sss.remove(sss.lastKey());
            n++;
        }

    }
}

class Vlogger{
    private String name;

    private String followerName;

    public Vlogger(String name, String followerName){
        this.name = name;
        this.followerName = followerName;
    }



    public String getName() {
        return name;
    }

    public String getFollowerName() {
        return followerName;
    }
}
