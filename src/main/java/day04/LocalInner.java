package day04;

public class LocalInner {
    private final int data=30;
    void display(){
        int value=50;
        class Local{
            void msg(){
                System.out.println("Value: "+value );
                System.out.println("Data: " +data);
            }
        }
        Local l=new Local();
        l.msg();
    }
    public static void main(String[] args){
        LocalInner obj=new LocalInner();
        obj.display();
    }
}
