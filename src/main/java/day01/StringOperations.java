package day01;

public class StringOperations {
    public static void main(String[] args) {
        //String concatination
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Concatinating: "+str1 +" "+str2);
        System.out.println("Concatination: " +str1.concat(" World"));
        String string = "Hello World";
        //Character to String
        char[] ch = {'c','h','a','r','a','c','t','e','r'};
        System.out.println("Convert Character array to single String: " +new String(ch));
        char c = 'H';
        System.out.println("Convert Character to String: "+Character.toString(c));

        //creating String using new keyword
        System.out.println("Creating String using 'new' Keyword: "+new String("Hello World"));
        System.out.println("Length of String: " +string.length());
        System.out.println("Character at position 4: " +string.charAt(4));
        System.out.println("Position of 'W':" +string.indexOf('W'));
        System.out.println("Compare Two Strings:" +string.compareTo("Hello World"));
        System.out.println("Compare Two Strings with Case Ignorance:" +string.compareToIgnoreCase("hello world"));
        System.out.println("Check sequence using contains: "+string.contains("orld"));
        System.out.println("Check character ends with 'd':" +string.endsWith("d"));
        System.out.println("Replace 'Hello' with 'Hi': " +new String("Hey There").replace("Hey","Hi"));
        System.out.println("Convert Lower to Upper Case: " +string.toLowerCase());
        System.out.println("Convert Upper to Lower Case: " +string.toUpperCase());

        // IndexOf() method
        String str= "This is Index of Example";
        //Character at position
        System.out.println("Index of character 'x': " + str.indexOf('x'));
        //Character at position after given index value
        System.out.println("Index of character 's' after 3 index: " + str.indexOf('s', 3));
        //Give index position for the given substring
        System.out.println("Index of substring 'is': " + str.indexOf("is"));
        //Give index position for the given substring and start index
        System.out.println("Index of substring 'is' form index:" + str.indexOf("is", 5));
    }
}
