public class Main {
    public static void main(String[] args) {

        ////q store a roll number
        int a =19;

        //q store a name
        String name ="ganesh";

        ////2 to store 500 names or 500 numbsers
        //in this case arrays are useful

        //syntax
        //datatype[] varaiable_name = new datatype[size];

        int [] rollNo = new int[5];
        //or
        int [] rollNo2 = {22,33,445,5,67};
        System.out.println("Hello world!");

        int [] ros;  //declaration of array //ros is getting defined in the stack
        ros=new int[5]; //initialization actually here object is being created in the memory (heap)

        System.out.println(ros[1]);
        System.out.println(ros[2]);

        String[] arr = new String[4];
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        String n = null;// assign null to non primitive types
       // int dob = null;//this will give error becsuse we cannot able to assign null to primitive types



        // data type element ref   non primitive objects
        for(String s: arr){
            System.out.println(s);
        }

    }


}