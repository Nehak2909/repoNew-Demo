package InterviewProgram;

import java.util.Arrays;

public class SecondLargestNum {
    public static int getSecondLargestNum(int[] arr)

    {        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-2];

    }
    public static void main(String[] args) {
            int arr[]={36,56,3,22,99,112};
        System.out.println(getSecondLargestNum(arr));
    }
}
