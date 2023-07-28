package practice;

public class ArraysQuestions {
    public static void main(String[] args) {


        //Practice 1
       /* float [] marks={12.2f,13.3f,14.4f,15.5f,16.6f};
        float sum=0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The Value "+sum);

        //Practice 2
        float[] marks = {12.2f, 13.3f, 14.4f, 15.5f, 16.6f};
        float num = 10.4f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The Value Is Present In array");
        }
        else {
            System.out.println("The Value Is Not Present In array");
        }


        // Practice 3
        float [] marks={55.2f,67.3f,77.4f,67.5f,87.6f};
        float sum=0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The Value "+sum/marks.length);



        // Practice 4
        Printing Array element of 2-d Array
        int [] [] mat1= { {1, 2, 3},
                        {4, 5, 6} };
        int [] [] mat2= { {2, 4, 6},
                        {8, 10, 12} };

        int [] [] result= { {0, 0, 0},
                          {0, 0, 0} };

        for (int i =0;i< mat1.length;i++){
            for (int j=0;j< mat2[i].length;j++){
                System.out.format("Setting Value For i=%d And j=%d\n",i,j);
                result [i][j] = mat1[i][j] + mat2 [i][j];
            }
        }
        for (int i =0;i< mat1.length;i++){
            for (int j=0;j< mat2[i].length;j++){
                System.out.print(result[i][j] + " ");
                result [i][j] = mat1[i][j] + mat2 [i][j];
            }
            System.out.println("");
        }


        //Practice 5
        int [] arr = {1 , 2, 3, 4, 5, 6};
        int l = arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for (int i=0;i<n;i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element:arr){
            System.out.print(element);
        }

        //Practice 6
        int [] arr = {11,22,22,422,22,00};
        int max=0;
        for (int e:arr){
            if (e>max){
                max = e;
            }
        }
        System.out.println("the value of the Maximum element is: "+max);
    }

        */
    }
}