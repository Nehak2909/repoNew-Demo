package InterviewProgram;

public class UniqueNumber3 {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,1,2,2};
        int result=0;
        for (int i=0; i<32; i++){
            int count=0;
            for (int nums:arr) {
                if((nums &(1<<i))!=0){
                    count++;
                }
                if(count %3 !=0){
                    result |=(1<<i);

                }
        }
        }

        System.out.println(result);

    }
}
