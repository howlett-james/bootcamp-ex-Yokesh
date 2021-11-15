package day03;

public class StaticFinalConcept {
    public static void main(String[] args) {
        final double pi = 3.14; //Immutable
        System.out.println("Addition of Two Numbers: " +add(21,12));
        StaticFinalConcept obj = new StaticFinalConcept();
        System.out.println("Subtraction of Two Numbers: " +obj.diff(21,12));
        System.out.println("Pi Value: " +pi);
        System.out.println("Subtraction of Three Numbers: " +obj.diff(21,12,8));
    }
    public static int add(int a,int b){
        return a + b;
    }
    public final int diff(int a, int b){
        return a - b;
    }
    public int diff(int a, int b,int c){
        return (a - b) - c;
    }
}