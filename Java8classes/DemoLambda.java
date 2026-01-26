package Java8classes;
interface A{
    void show(int i);
}
public class DemoLambda {
    public static void main(String[] args) {
        A obj ;
        obj=i-> System.out.println("hello"+i);
        obj.show(6);
    }
}

