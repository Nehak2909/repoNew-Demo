package InterviewProgram;

class Parent{
    Parent(){
        System.out.println("parent constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Contructor");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        new Child();
    }
}
