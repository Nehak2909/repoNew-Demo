package InterviewProgram;

public class NumberSwapping {
    public static void main(String[] args) {
        int a=24;
        int b =23;
        System.out.println("Before Swap-> a:"+a+" , b"+ b);
        swapping(a,b);
    }
    public static void swapping(int a, int b)
    {
        a = a  +b;           //24+23=47
        b= a - b ;          // 47-23=24
       a = a - b;           // 47-24=23
        System.out.println("after swap  ->a:"+a+" , b:"+b);
    }
}
