package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();//Order Way and Alfabetical Form To Print Data
        treeSet.add("Vivek");
        treeSet.add("zara");
        treeSet.add("Ajay");
        treeSet.add("Pradeep");
        treeSet.add("Dhaval");
        treeSet.add("Pradeep");
        treeSet.add("Badal");
        System.out.println(treeSet);
//        treeSet.forEach(System.out::println);
    }
}
