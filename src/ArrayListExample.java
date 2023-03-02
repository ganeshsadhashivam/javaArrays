import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
    //ArrayList i s class in utill package in collections framwork
       //we need to pass wrapper classes in type that this ArrayList going
        // to store
        ArrayList<Integer> list = new ArrayList<>(10) ;

//        list.add(55);
//        list.add(66);
//        list.add(5);
//        list.add(6);
//        list.add(1);
//        list.add(63);
//        list.add(52);
//        list.add(8); list.add(500);
//        list.add(56); list.add(54654);
//        list.add(69);

   // System.out.println(list);

  //  System.out.println(list.contains(111));

    //list.set(0,9999);
      //  System.out.println(list);


        //getting input
        for(int i=0;i<5 ;i++){
            list.add(in.nextInt());
        }



        //get itemd from any index
        for(int i=0;i<5 ;i++){
           System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println(list);
    }
}
