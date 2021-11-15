package day04;

interface Sayable{
    public String say(String name);
}
interface Addition{
    int add(int a,int b);
}

public class LambdaConcept {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("James Howlett"));

        // You can omit function parentheses
        Sayable s2= name ->{
            return "Hello, "+name;
        };
        System.out.println(s2.say("logan"));

        //Multiple Parameter
        Addition addition1 = (a,b)->(a+b);
        System.out.println(addition1.add(10,20));
        // Multiple parameters with data type in lambda expression
        Addition addition2 = (int a, int b) -> (a+b);
        System.out.println(addition2.add(100,200));
        // Multiple parameters with data type in lambda expression and return keyword
        Addition addition3= (int a, int b) -> {
            return (a+b);
        };
        System.out.println(addition3.add(1000,2000));
    }
}
