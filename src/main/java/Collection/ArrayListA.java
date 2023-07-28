package Collection;

import java.util.ArrayList;

public class ArrayListA {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Vivek");
        name.add("Ajay");
        name.add("Pradeep");
        name.add("Dhaval");
        name.add(1,"DhavalD");//Add Method
        name.add(0,"Vivo");
//        System.out.println(name);
//        name.remove(0);//Remove Method
        System.out.println(name);
        name.remove(4);
        System.out.println(name.get(3));
//        name.set(0,"vivo");//replace == set
//        name.add(3,"newSet");
        System.out.println(name);
        System.out.println(name.get(1));//Get One Element
        // clear Array =.clear()
//        name.clear();
//        System.out.println(name);
    }
}
