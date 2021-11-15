package day04;
class Greetings extends Thread{
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Hi Yokesh" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Wish extends Thread{
    public void run() {
        for (int i =1;i<=5;i++){
            System.out.println("Good Afternoon !");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadConcept {
    public static void main(String[] args) throws InterruptedException {
        Greetings greetings = new Greetings();
        Wish wish = new Wish();

        greetings.start();
        wish.start();

    }
}
