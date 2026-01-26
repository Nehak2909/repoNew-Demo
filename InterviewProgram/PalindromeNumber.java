package InterviewProgram;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num=121;
        int originalNum=num;
        int reversedNum=0;
        while(num>0){

            //for getting the last number we do num%10
            int lastDigit = num % 10;

            //build the reversed number
            reversedNum=reversedNum*10+lastDigit;

            //remove last digit from the original num
            num/=10;

        }
        if(originalNum==reversedNum){
            System.out.println( "original number is palindrome");
        }
        else {
            System.out.println( "original number is not palindrome ");
        }
    }
    public void palindrome ()
    {

    }
}
