package Java8classes;

interface Phone{
    void call();
    default void msg(){
        System.out.println("Messaging....");
    }
}
class AndroidPhone implements Phone{
    public void call(){
        System.out.println("Calling...");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        Phone p =  new AndroidPhone();
        p.call();
        p.msg();

    }
}
