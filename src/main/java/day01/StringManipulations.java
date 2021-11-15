package day01;

public class StringManipulations {
    public static void main(String[] args) {
        //Palindrome
        System.out.println("Check Palindrome: " +isPalindrome("madam"));
        //Remove given character
        System.out.println("Remove Given Character: " +removeChar("madam",'m'));

    }
    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }

    private static String removeChar(String str, char c) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(c), "");
    }

}
