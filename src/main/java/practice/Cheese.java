package practice;

public class Cheese {
    private int milk;

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public static void main(String[] args) {
        Cheese mycheese = new Cheese();
        mycheese.setMilk(10);
        Cheese2(mycheese);
        System.out.println(mycheese.getMilk());
    }

    private static void Cheese2(Cheese cheese) {

        cheese = new Cheese();
        cheese.setMilk(11);
        cheese.setMilk(cheese.getMilk() + 1);
    }
}
//public static void main(String[] args) {
//    int[] marks = {11, 12, 13, 14, 15};
//    System.out.println("Printing Using for Loop");
//    System.out.println(marks[0]);
//    System.out.println(marks[1]);
//    System.out.println(marks[2]);
//    System.out.println(marks[3]);
//    System.out.println(marks[4]);
//
//    System.out.println("Printing Using for Loop");
//    for (int i=0;i< marks.length;i++){
//        System.out.println(marks[i]);
//    }
//
//    System.out.println("reverse Order");
//    for (int i=marks.length-1;i>=0;i--){
//        System.out.println(marks[i]);
//    }
////for-each loop
//    for (int element:marks){
//        System.out.println(element);
//    }
//    System.out.println(marks.length);


//    int sum =0;
//    int n=3;
//    int i=0;
//    while (i<n){
//        sum = sum + (2*i);
//        i++;
//    }

//    System.out.println(sum);
//    for (int i=0;i<n;i++){
//        sum= sum + (2*i);
//    }
//    System.out.println(sum);


//    String name ="Vivek";
//    String name2 = "Vivek";
//    String name3 = new String("Vivek");
//    System.out.println(name==name3);


