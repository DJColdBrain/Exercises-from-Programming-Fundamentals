package stackOfStrings;


import java.util.ArrayList;

public class StackOfStrings {

    private ArrayList<String> data;

    StackOfStrings(){
        data = new ArrayList<>();
    }

    public void push(String item){
        data.add(0, item);
    }

    public String pop (){
        String item = data.get(0);
        data.remove(0);
        return item;
    }

    public String peek(){
        return data.get(0);
    }

    public boolean isEmpty(){
        return data.size() > 0 ?  false : true;
    }
}
