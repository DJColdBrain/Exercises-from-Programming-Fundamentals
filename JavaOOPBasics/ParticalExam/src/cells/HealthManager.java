package cells;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class HealthManager {

    public static LinkedHashMap<String, Organism> organisms = new LinkedHashMap<>();
    
    public String checkCondition (String organismName) {
        return organisms.get(organismName).toString();
    }

    public String createOrganism(String name) {
        if (organisms.containsKey(name)){
            return ("Organism "+ name +" already exists");
        }else {
            Organism organism = new Organism(name);
            organisms.put(name, organism);
            return "Created organism "+ name;
        }
    }

    public String addCluster(String organismName, String id, int rows, int cols) {
        Cluster cluster = null;
        try {
            cluster = new Cluster(id, rows, cols);
        }catch (Exception e ){
            return "";
        }
        if (!organisms.containsKey(organismName)){
            return "";
        }
        if (organisms.get(organismName).getClusters().containsKey(id)){
            return "";
        }
        organisms.get(organismName).addCluster(cluster);
        return "Organism "+ organismName +": Created cluster " + id;
    }

    public String addCell(String organismName, String clusterId, String cellType, String cellId, int health, int positionRow, int positionCol, int additionalProperty)
    {

        if (!organisms.containsKey(organismName)){
            return "";
        }if (!organisms.get(organismName).getClusters().containsKey(clusterId)){
        return "";
         }
         if (organisms.get(organismName).getClusters().get(clusterId).getRows() <= positionRow ||
                 organisms.get(organismName).getClusters().get(clusterId).getCols() <= positionCol){
            return "";
         }

        Cell cell = null;
         try {
             switch (cellType){
                 case "Bacteria":
                     cell = new Bacteria(cellId, health,positionRow, positionCol,additionalProperty);
                     break;
                 case "Fungi":
                     cell = new Fungi(cellId, health,positionRow, positionCol,additionalProperty);
                     break;
                 case "Virus":
                     cell = new Virus(cellId, health,positionRow, positionCol,additionalProperty);
                     break;
                 case "RedBloodCell":
                     cell = new RedBloodCell(cellId, health,positionRow, positionCol,additionalProperty);
                     break;
                 case "WhiteBloodCell":
                     cell = new WhiteBloodCell(cellId, health,positionRow, positionCol,additionalProperty);
                     break;
             }
         }catch (Exception e){
             return "";
         }

        organisms.get(organismName).getClusters().get(clusterId).addCell(cell);
        return "Organism "+ organismName +": Created cell " + cellId +" in cluster "+ clusterId;
    }
    public String activateCluster(String organismName){
        if (!organisms.containsKey(organismName)){
            return "";
        }
        if (organisms.get(organismName).getClusters().size() == 0){
            return "";
        }
        
        String clusterInOrder = organisms.get(organismName).getNextClusterInOrder();
        Cluster cluster = organisms.get(organismName).getClusters().get(clusterInOrder);
        cluster.getCells().stream().sorted(Comparator.comparing(Cell::getPositionRow).thenComparingInt(Cell::getPositionCol)).collect(Collectors.toList());



        while(cluster.getCells().size() >1){
            String name = cluster.getCells().get(0).getClass().getSimpleName();
            if (name.equals("RedBloodCell") || name.equals("WhiteBloodCell")){
                cluster.getCells().get(0).consume(cluster.getCells().get(1));
                cluster.getCells().remove(1);
            }else{
                while (cluster.getCells().get(0).getHealth() > 0){
                    cluster.getCells().get(0).attack(cluster.getCells().get(1));
                    if (cluster.getCells().get(1).getHealth() <= 0){
                        break;
                    }
                    cluster.getCells().get(1).attack(cluster.getCells().get(0));
                }
                if (cluster.getCells().get(0).getHealth() <= 0){
                    cluster.getCells().remove(0);
                }else if(cluster.getCells().get(1).getHealth() <= 0){
                    cluster.getCells().get(0).kill(cluster.getCells().get(1));
                    cluster.getCells().remove(1);
                }
            }
        }
        return "Organism "+ organismName +": Activated cluster "+ clusterInOrder +". Cells left: " + cluster.getCells().size();
    }
}
