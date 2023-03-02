import java.util.Arrays;

public class Swap {

public static void main(String[] args){
    int[] arr = {1,2,44,566,8};
    System.out.println("Before swapping");
    System.out.println(Arrays.toString(arr));
    swap (arr,1,3);
    System.out.println("After swapping");
    System.out.println(Arrays.toString(arr));

   reverseArray (arr);
    System.out.println("After reversing");
    System.out.println(Arrays.toString(arr));
}

static void swap(int arr[],int index1,int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}

static  void reverseArray(int arr[]){
    int start = 0;
    int end =arr.length-1;
    while(start<end){
        swap(arr,start,end);
        start++;
        end--;
    }
}



}
