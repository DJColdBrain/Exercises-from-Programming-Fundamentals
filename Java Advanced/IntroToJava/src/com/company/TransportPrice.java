package com.company;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double km = Double.parseDouble(scanner.nextLine());
        double money = 0f;
        if (km >= 100){
            String  time = scanner.nextLine();


                money = money +(km*0.06f);

            System.out.printf("%.2f", money);
        }else if (km >= 20){
            String  time = scanner.nextLine();

                money = money +(float) (km*0.09f);

            System.out.printf("%.2f", money);
        }else{

            String  time = scanner.nextLine();
            if (time.equals("day")){
                money = 0.70 + (float)(km*0.79f);
            }else if (time.equals("night")){
                money = 0.70 + (float)(km*0.90f);
            }
            System.out.printf("%.2f", money);
        }
    }
}
