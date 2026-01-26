package Java8classes;

class InnerClassImpl{
    public void test(){

        System.out.println("outer main method");
        class Inner{
            void test(){
                System.out.println("inner local class method");
            }
        }
        Inner inner = new Inner();
        inner.test();
    }
    public static void main(String[] args) {
        InnerClassImpl i = new InnerClassImpl();
        i.test();


    }

}

