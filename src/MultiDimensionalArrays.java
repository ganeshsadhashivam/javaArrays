import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {

    public static void main(String[] args){

        /*
        123
        456
        789
         *

         */
       //                         rows are manodatory to mention
     //   int [][] arr = new int [3][];

        Scanner in =new Scanner(System.in);
        int [][] arr = {
                {1,2,3},// 0 th index
                {4,5},//1 index
                {7,8,9} // 2 nd index
        };


        int [][] arr2d = new int[3][3];
        System.out.println(arr2d.length);

        //for getting input values
        for (int row = 0;row<arr2d.length;row++){
            //for each col in every row
            for(int col = 0;col <arr2d[row].length;col++){
                arr2d[row][col] = in.nextInt();
            }
        }

// for printing
        for (int row = 0;row<arr2d.length;row++){
            //for each col in every row
            for(int col = 0;col <arr2d[row].length;col++){
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }


        //using
        System.out.println("using Arrrays class to string method");
        for(int row = 0; row < arr2d.length;row++ ){
            System.out.println(Arrays.toString(arr2d[row]));
        }


        //enhanced for loop
        //in this arrays of int data type
        /*
        [
            [1 2 3], // 0 th
            [4 5 6],// 1 th
            [7 8 9] // 2 nd
        ]
         */
        System.out.println("using enhanced for loop");
        for (int [] a : arr2d){
            System.out.println(Arrays.toString(a));
        }



    }
}
