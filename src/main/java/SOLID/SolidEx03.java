package SOLID;
/*
 * SOLID Principles -
 * SOLID is an acronym for the first five object-oriented design (OOD) principles by Robert C. Martin
 *
 * S - Single Responsibility Principle - A class should have one and only one reason to change
 * O - Open Closed Principle - Objects or entities should be open for extension but closed for modification
 * L - Liskov Substitution Principle - Objects of super class shall be replaced with objects of subclasses.
 * I -
 * D -
 * */

class Car{
    public void start(){
        System.out.println("Car -- Started");
    }
    public void stop(){
        System.out.println("Car -- Stopped");
    }
}

class BMW extends Car{
    public void start(){
        System.out.println("BMW -- Started");
    }
    public void stop(){
        System.out.println("BMW -- Stopped");
    }
}

class AUDI extends Car{
    public void start(){
        System.out.println("AUDI -- Started");
//        throw new RuntimeException("boom You're Gone!");
    }
    public void stop(){
        System.out.println("AUDI -- Stopped");
    }
}

public class SolidEx03 {
    static void testDrive(Car car){
        car.start();
        car.stop();
    }
    public static void main(String[] args){
        testDrive(new Car());
        testDrive(new BMW());
        testDrive(new AUDI());
    }
}
