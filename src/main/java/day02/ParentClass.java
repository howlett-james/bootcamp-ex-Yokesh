package day02;

public class ParentClass {

    public ParentClass(){
        System.out.println("Parent Class");
    }
    public ParentClass(String str){
          // Objects of String class
        StringBuilder reverse = new StringBuilder();
        System.out.println("Parent Class constructor with Single argument");
        System.out.println("Palindrome");
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse.append(str.charAt(i));
        if (str.equals(reverse.toString()))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
    public ParentClass(String str1, String str2){
        System.out.println("Parent class constructor with Two Arguments ");
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Both strings are equal");
        }else {
            System.out.println("Both Strings are not equal");
        }
    }
}
