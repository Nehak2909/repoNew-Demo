package InterviewProgram;

public class PalindromeString {

    public static void main(String[] args) {

        String str="abas";

        String palindromeString  = "";

        for (int i=str.length()-1; i >= 0; i--){

            palindromeString += str.charAt(i);
        }
        if(str.equals(palindromeString)){

            System.out.println("String is a Palindrome");
        }
        else {

            System.out.println("String is not a Palindrome ");
        }
    }
}

