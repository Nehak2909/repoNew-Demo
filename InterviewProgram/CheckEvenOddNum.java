package InterviewProgram;

public class CheckEvenOddNum {
    public static void main(String[] args) {
        int num=99;
        /*// Using bitwise operator
        if ((num & 1) == 0)

        // Using modulus (most common)
            if (num % 2 == 0)*/
        if(num/2*2==num){
            System.out.println("Number is even");

        }
        else {
            System.out.println("number Is Odd");
        }
    }
}
