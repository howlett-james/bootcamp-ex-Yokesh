package day04;

public class EnumConcept {
    enum Size {

        // enum constants calling the enum constructors
        SMALL("The size is small."),
        MEDIUM("The size is medium."),
        LARGE("The size is large."),
        EXTRALARGE("The size is extra large.");

        private final String pizzaSize;

        // private enum constructor
        private Size(String pizzaSize) {
            this.pizzaSize = pizzaSize;
        }

        public String getSize() {
            return pizzaSize;
        }
    }
    public enum Season { WINTER, SPRING, SUMMER, FALL }
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());

        Size size = Size.SMALL;
        System.out.println(size.getSize());
    }
}