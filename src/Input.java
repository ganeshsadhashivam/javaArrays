import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[]args){
        Scanner in =new Scanner(System.in);

        //Arrays of primitives
        int [] arr = new int [5];
        arr[0] = 23;
        arr[1]=500;
        System.out.println(arr[1]);

        System.out.println("input values to the array");
        //for getting values arrays
        for(int i=0; i<arr.length;i++){
            arr[i] = in.nextInt();

        }

        //for printting arrays
        for(int i=0; i<arr.length;i++){
          System.out.println(arr[i] );

        }

        //enhancedd for loop
        System.out.println("using Enhanced for loop");
        for(int num:arr){
            System.out.println(num);
        }

        //in Arrays class toString  method to print arrays
        //Another way to print arrays in
        System.out.println(Arrays.toString(arr));


        System.out.println("Arrays of Objects");
        //Arrays of objects
        //String [] names = new String[5];
//        for(int i=0;i<names.length;i++){
//            names[i] = in.next();
//        }
String [] names =   {"ganesh", "gokil", "georrge", "anbu", "arabind"};
//        for(int i=0;i<names.length;i++){
//            names[i] = in.next();
//        }
        System.out.println(Arrays.toString(names));

        names[1]  = "Kunal";

        System.out.println(Arrays.toString(names));

    }
}
