package Collection;

import java.util.LinkedHashSet;

public class ArrayLinkHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Z");
        linkedHashSet.add("k");
        linkedHashSet.add("c");
        linkedHashSet.add("b");
        linkedHashSet.add("a");
        System.out.println(linkedHashSet);
        linkedHashSet.add("o");
        System.out.println(linkedHashSet);
    }
}
