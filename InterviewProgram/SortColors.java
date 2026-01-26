package InterviewProgram;

public class SortColors {
    public static void main(String[] args) {
        int []arr={2,0,2,1,1,0};
        int zeros=0, ones=0, twos=0;
        for (int i = 0; i <=arr.length-1 ; i++ ){
            if(arr[i]==zeros) zeros++;
            if (arr[i] == ones) ones++;
            if ( arr[i] == twos) twos++;

        }
        int i=0;
        while(zeros--> 0 )
        {
            arr[i++]=0;
        }
        while(ones--> 0)
        {
            arr[i++]=1;
        }
        while(twos--> 0)
        {
            arr[i++]=2;
        }
        for (int nums:arr
             ) {
            System.out.println(nums);
        }
    }
}
