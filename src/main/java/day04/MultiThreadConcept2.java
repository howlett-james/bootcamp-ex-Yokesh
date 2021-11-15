package day04;

public class MultiThreadConcept2 {
    public static void main(String[] args) {
        //MultiThread using Interface and implemented Lambda expression
        Runnable obj1 = () -> {
            for(int i=1;i<=5;i++){
                System.out.println("Hi Logan" );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Happy Diwali !");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try { Thread.sleep(100); } catch (Exception ignored){ }
        t2.start();
        /*
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=5;i++){
                System.out.println("Hi Logan" );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Happy Diwali !");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        */
    }
}
