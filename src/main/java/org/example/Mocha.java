package org.example;

import java.util.ArrayList;

public class Mocha extends Coffee{

    ArrayList<String>arrayList=new ArrayList<>();
    @Override
    public Coffee prepare() {
        System.out.println("Mocha Coffee Is Ready");
        arrayList.add("Price "+getPrice());
        arrayList.add("Quantity "+getQuantity());
        System.out.println(arrayList);
//        System.out.println("One Mocha Price Is  " + getPrice());
//        System.out.println("Mocha quantity Is  " + getQuantity());
//        int sum=getPrice();
//        int sum1=getQuantity();
//        int sumtotal=sum*sum1;
//        System.out.println("Total coffee Payment  "+ getPrice() +" * "+ getQuantity()+" Total= "+sumtotal);
        return new Mocha();
    }

    @Override
    public int getPrice() {
        return 150;
    }
}
