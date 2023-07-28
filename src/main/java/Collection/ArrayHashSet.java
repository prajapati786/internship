package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class ArrayHashSet {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>();//Sort Way To Print Data only Integer ,it is Faster than TreeSet
        hashSet.add("vivek");
        hashSet.add("ajay");
        hashSet.add("ajay");
        hashSet.add("pradeep");
        hashSet.add("dhaval");
        hashSet.add("zara");
        System.out.println(hashSet);
//        Iterator<String> iterator=hashSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        hashSet.forEach(System.out::println);
//        for (Integer Vi:hashSet){
//            System.out.println(Vi);
//        }
//        System.out.println(hashSet);
//        hashSet.remove(6);
//        System.out.println(hashSet);
//        System.out.println(hashSet.size());//size Show
//        System.out.println(hashSet.contains(10));//true or false
//        System.out.println(hashSet.isEmpty());
//        hashSet.clear();// clear Values
//        System.out.println(hashSet);
    }
}
