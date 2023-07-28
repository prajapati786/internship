package Collection;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class ArrayHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Mocha");
        hashMap.put(2,"Latte");
        hashMap.put(3,"Espresso");
        hashMap.put(4,"BlackCoffee");
        hashMap.put(5,"Tea");

        System.out.println(hashMap);
        System.out.println(hashMap.get(5));//get one value
        System.out.println(hashMap.containsKey(6));//false
        System.out.println(hashMap.containsValue("Tea"));//true
        hashMap.put(1,"Mochaaaaaa");
        System.out.println(hashMap);//change Value
        hashMap.replace(2,"chaiiiii");
        System.out.println(hashMap);
        hashMap.putIfAbsent(6,"Tea");
        System.out.println(hashMap);
        hashMap.remove(6);
        System.out.println(hashMap);
    }

}
