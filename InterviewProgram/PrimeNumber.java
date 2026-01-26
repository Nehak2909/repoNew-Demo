
package InterviewProgram;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp=0;
        int num = 52;
        for (int i=2; i<=num/2; i++){
            if (num%2==0)
            {
                temp++;
            }

        }
        if(temp==0 && num!=0)
        {
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        }
    }
}