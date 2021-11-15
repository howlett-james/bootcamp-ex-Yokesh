package SOLID;
/*
 * SOLID Principles -
 * SOLID is an acronym for the first five object-oriented design (OOD) principles by Robert C. Martin
 *
 * S - Single Responsibility Principle - A class should have one and only one reason to change
 * O - Open Closed Principle - Objects or entities should be open for extension but closed for modification
 * L - Liskov Substitution Principle - Objects of super class shall be replaced with objects of subclasses.
 * I - Interface Segregation Principle - A client should never be forced to implement an interface that it doesn't use
 * D -
 * */

interface VegRestaurant{
    void vegMeals();
}
interface NonVegRestaurant{
    void nonVegMeals();
}

class ABCVegRestaurant implements VegRestaurant{

    @Override
    public void vegMeals() {
        System.out.println("Provide Veg Meals");
    }
}

class XYZNonVegRestaurant implements VegRestaurant,NonVegRestaurant{

    @Override
    public void nonVegMeals() {
        System.out.println("Provide Non-Veg Meals");
    }

    @Override
    public void vegMeals() {
        System.out.println("Provide Veg Meals");
    }
}

public class SolidEx04 {
    public static void main(String[] args) {
        ABCVegRestaurant restaurant1 = new ABCVegRestaurant();
        restaurant1.vegMeals();
        XYZNonVegRestaurant restaurant2 = new XYZNonVegRestaurant();
        restaurant2.vegMeals();
        restaurant2.nonVegMeals();
    }
}
