package DesignPrinciples;

class Helper{
    void M()
    {
        System.out.println("hello from M()");
        this.anotherMethod();
    }

    void anotherMethod()
    {
        System.out.println("I am anotherMethod() of same class");
    }
}

public class LawOfDemeter {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.M();
    }
}
