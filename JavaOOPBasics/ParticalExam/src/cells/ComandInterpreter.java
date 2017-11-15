package cells;

public class ComandInterpreter {

    public void interpret(String command){
        String[] commands = command.split("\\s+");
        HealthManager manager =new HealthManager();
        String result;
        switch (commands[0]){
            case "createOrganism":
                result = manager.createOrganism(commands[1]);
                if (!result.equals("")){
                    System.out.println(result);
                }
                break;
            case "addCluster":
                result = manager.addCluster(commands[1], commands[2], Integer.parseInt(commands[3]),Integer.parseInt(commands[4]));
                if (!result.equals("")){
                    System.out.println(result);
                }
                break;
            case "addCell":
                result = manager.addCell(commands[1],commands[2], commands[3], commands[4],Integer.parseInt(commands[5]),Integer.parseInt(commands[6]),Integer.parseInt(commands[7]),Integer.parseInt(commands[8]));
                if (!result.equals("")){
                    System.out.println(result);
                }
                break;
            case "activateCluster":
                result =  manager.activateCluster(commands[1]);
                if (!result.equals("")){
                    System.out.println(result);
                }
                break;
            case "checkCondition":
                result = manager.checkCondition(commands[1]);
                if (!result.equals("")){
                    System.out.print(result);
                }
                break;
        }
    }
}
