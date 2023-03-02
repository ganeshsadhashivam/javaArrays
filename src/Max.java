import java.util.Arrays;

public class Max {
    public static void main(String [] args){
        int[] arr = {1,2,44,566,8};
        //System.out.println("Before swapping");
       // System.out.println(Arrays.toString(arr));
        int value = maxValue (arr);
        System.out.println(value);

        int value2 = maxRange (arr,0,2);
        System.out.println(value2);
        //System.out.println(Arrays.toString(arr));
    }

    //max value
    static int maxValue(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
      return max;
    }

//max value betweeen two ranges
    static int maxRange(int arr[],int start,int end){

        if(start > end){
            return -1;
        }

        if (arr == null){
            return -1;
        }
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
