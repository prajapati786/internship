package practice;

public class PassBy {
    String name;
    float mileages;
    int cost;


    public static void main(String[] args) {
        PassBy passBy = new PassBy();
        passBy.name="BMW";
        passBy.mileages=5.5f;
        passBy.cost=200000;

        System.out.println("First");
        System.out.println(passBy.name);
        System.out.println(passBy.mileages);
        System.out.println(passBy.cost);

        PassBy passBy1;
        passBy1 = passBy;

        System.out.println("reference Used");
        System.out.println(passBy1.name);
        System.out.println(passBy1.mileages);
        System.out.println(passBy1.cost);


        passBy1.name="TATA";
        passBy1.mileages=9.5f;
        passBy1.cost=300000;


        System.out.println(" new reference Value");
        System.out.println(passBy1.name);
        System.out.println(passBy1.mileages);
        System.out.println(passBy1.cost);


        System.out.println(passBy.name);
        System.out.println(passBy.mileages);
        System.out.println(passBy.cost);



    }
}
