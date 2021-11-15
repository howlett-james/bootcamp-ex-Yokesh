package day03;

public class SecondClass {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass("yokesh", 21);
        FirstClass firstClass1 = new FirstClass("yokesh", 21);
        if(firstClass.hashCode() == firstClass1.hashCode()){
            if(firstClass.equals(firstClass1))
                System.out.println("Both Objects are equal");
            else
                System.out.println("Both Objects are not equal !");
        }
        else {
            System.out.println("Both Objects are not equal");
        }

    }
}
