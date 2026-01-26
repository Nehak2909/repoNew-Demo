package Java8classes;
interface Interf{
    public static void add()
    {
        System.out.println(" static method ");
    }
}
public class FunctionalEaxample {
    public static void main(String[] args) {
        Interf.add();
    }
}

