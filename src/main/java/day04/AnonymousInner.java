package day04;

abstract class Person{
    abstract void eat();
}
public class AnonymousInner {
    public static void main(String[] args) {
        Person p = new  Person(){
            void eat(){
                System.out.println("Nice Food");
            }
        };
        p.eat();
    }
}
