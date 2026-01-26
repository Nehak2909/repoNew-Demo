package Java8classes;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("running using anonmymous class");
            }

        };
        Runnable r2=()-> System.out.println("running");
        new Thread(r1).start();
        new Thread(r2).start();

    }

}

