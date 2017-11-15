package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            String animal = reader.readLine();
            if (animal.equals("Beast!")){
                break;
            }
            try {
                switch (animal){
                    case "Cat":
                        String[] data = reader.readLine().split("\\s+");
                        if (data.length != 3){
                            throw new IllegalArgumentException("Invalid input!");
                        }
                        String name = data[0];
                        int age= Integer.parseInt(data[1]);
                        String gender= data[2];
                        Cat cat = new Cat(name, gender,age);
                        System.out.println(animal);
                        System.out.println(cat);
                        cat.produceSound();
                        break;
                    case "Dog":
                        data = reader.readLine().split("\\s+");
                        if (data.length != 3){
                            throw new IllegalArgumentException("Invalid input!");
                        }
                        name = data[0];
                        age= Integer.parseInt(data[1]);
                        gender= data[2];
                        Dog dog = new Dog(name, gender,age);
                        System.out.println(animal);
                        System.out.println(dog);
                        dog.produceSound();
                        break;
                    case "Frog":
                        data = reader.readLine().split("\\s+");
                        if (data.length != 3){
                            throw new IllegalArgumentException("Invalid input!");
                        }
                        name = data[0];
                        age= Integer.parseInt(data[1]);
                        gender= data[2];
                        Frog frog = new Frog(name, gender,age);
                        System.out.println(animal);
                        System.out.println(frog);
                        frog.produceSound();
                        break;
                    case "Kitten":
                        data = reader.readLine().split("\\s+");
                        if (data.length != 3){
                            throw new IllegalArgumentException("Invalid input!");
                        }
                        name = data[0];
                        age= Integer.parseInt(data[1]);
                        gender= data[2];
                        Kitten kitten = new Kitten(name, gender,age);
                        System.out.println(animal);
                        System.out.println(kitten);
                        kitten.produceSound();
                        break;
                    case "Tomcat":
                        data = reader.readLine().split("\\s+");
                        if (data.length != 3){
                            throw new IllegalArgumentException("Invalid input!");
                        }
                        name = data[0];
                        age= Integer.parseInt(data[1]);
                        gender= data[2];
                        Tomcat tomcat = new Tomcat(name, gender,age);
                        System.out.println(animal);
                        System.out.println(tomcat);
                        tomcat.produceSound();
                        break;
                        default:
                            throw new IllegalArgumentException("Invalid input!");

                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }



        }
    }
}
