package InterviewProgram;

public class ReversedString {
    public static void main(String[] args) {
        String s = "neha";
         String reversed=" ";

         for (int i=s.length()-1; i>=0; i-- ){

             reversed+=s.charAt(i);
         }
        System.out.println("reversed String: "+ reversed);
    }

}
