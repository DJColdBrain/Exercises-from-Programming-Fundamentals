package cells;

import java.util.*;

public class Organism {
    private String name;
    private LinkedHashMap<String , Cluster> clusters;
    private Deque<String> orderOfActivation;

    public Organism(String name) {
        setName(name);
        this.clusters = new LinkedHashMap<>();
        orderOfActivation = new ArrayDeque<>();
    }

    private void setName(String name){
        this.name = name;
    }

    public void addCluster(Cluster cluster){
        this.clusters.put(cluster.getId(), cluster);
        orderOfActivation.offerLast(cluster.getId());
    }

   protected String getNextClusterInOrder(){
        orderOfActivation.offerLast(orderOfActivation.pollFirst());
        return orderOfActivation.peekLast();
   }

    protected Map<String, Cluster> getClusters() {
        return Collections.unmodifiableMap(clusters);
    }

    private int allCells(){
        int n = 0;
        for (Cluster cluster : clusters.values()) {
            n += cluster.getCells().size();
        }
        return n;
    }

    @Override
    public String toString() {
        String toReturn = "Organism - " + this.name+
                "\n--Clusters: " + clusters.size() +
                "\n--Cells: " + allCells() ;

//        for (Cluster cluster : clusters.values()) {
//            toReturn+=cluster;
//        }
        for (int i = 0; i < orderOfActivation.size(); i++) {
            toReturn+=clusters.get(orderOfActivation.peekFirst());
            orderOfActivation.offerLast(orderOfActivation.pollFirst());
        }
        toReturn += "\n";
        return toReturn;
    }
}
