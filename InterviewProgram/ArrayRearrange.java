package InterviewProgram;

import java.util.Arrays;

public class ArrayRearrange
{
    public static void main(String[] args) {
        int arr[] ={3,1,4,6,9,2,7};
        System.out.println("Original Array : "+Arrays.toString(arr));

        Arrays.sort(arr);
        for (int i=0;i< arr.length-1; i += 2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println("rearranged array : "+Arrays.toString(arr));
    }
}
