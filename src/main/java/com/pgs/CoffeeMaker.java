package com.pgs;
import org.example.Coffee;
import org.example.Espresso;
import org.example.Latte;
import org.example.Mocha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class CoffeeMaker {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
//        HashMap<Integer, String> hashMap = new HashMap<>();
        List<Coffee> coffeeList=new ArrayList<>();
        System.out.println("How Many Coffee You Want");
        int n=scanner.nextInt();
        for (num = 1; num <= n; num++) {
            System.out.println("1, Mocha");
            System.out.println("2, Latte");
            System.out.println("3, Espresso");
//            System.out.println(hashMap);
            System.out.println("Select Coffee You Want: ");
           int  choice = scanner.nextInt();

            Coffee coffee = null;
            switch (choice) {
                case 1:
                    System.out.println("How Many Mocha Coffee You Want");
                    int mQuantity = scanner.nextInt();
                    coffee = new Mocha();
                    coffee.setQuantity(mQuantity);
                    coffeeList.add(coffee);

                    break;
                case 2:
                    System.out.println("How Many Latte Coffee You Want");
                    int lQuantity = scanner.nextInt();
                    coffee = new Latte();
                    coffee.setQuantity(lQuantity);
                    coffeeList.add(coffee);
                    break;
                case 3:
                    System.out.println("How Many Espresso Coffee You Want");
                    int eQuantity = scanner.nextInt();
                    coffee = new Espresso();
                    coffee.setQuantity(eQuantity);
                    coffeeList.add(coffee);
                    break;
                default:
                    System.out.println("Exit");
            }
            coffee.prepare();
            System.out.println();
        }
        AtomicInteger total = new AtomicInteger();
        coffeeList.forEach(coffee -> {
            System.out.println("Coffee: " + coffee.getClass().getSimpleName() + " Price:" + coffee.getPrice() + " Quantity :"+coffee.getQuantity());
            total.addAndGet(coffee.getPrice()* coffee.getQuantity());
        });

        System.out.println("Total : "+ total.get());
    }
}