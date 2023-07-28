package Collection;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ArrayLinkHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(1,"Mocha");
        linkedHashMap.put(56,"Latte");
        linkedHashMap.put(99,"Espresso");
        linkedHashMap.put(1,"BlackCoffee");
        linkedHashMap.put(5,"Tea");
        System.out.println(linkedHashMap);
    }
}
