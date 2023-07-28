package Collection;

import java.util.LinkedList;

public class ArrayLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> link=new LinkedList<>();
        link.add(10);
        link.add(9);
        link.add(8);
        link.add(7);
        link.add(6);
        link.add(5);
        link.add(4);
        link.add(3);
        link.add(2);
        link.add(1);
        System.out.println(link);
//        for (Integer str:link){
//            System.out.println(str);
//        }
        link.set(6,5);
        System.out.println(link);
//        System.out.println(link.get(9));
//        System.out.println(link);
//        link.remove(6);
//        System.out.println(link);
//        System.out.println(link.get(8));
//        System.out.println(link);
//        link.addFirst("VI");
//        System.out.println(link);
//        link.addLast("Jio");
//        System.out.println(link);
//        link.add(3,"airtel");
//        System.out.println(link);
    }
}
