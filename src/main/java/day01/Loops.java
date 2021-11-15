package day01;

public class Loops {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] ch =str.toCharArray();
        //reverse string using for loop
        StringBuilder rev= new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            rev.append(ch[i]);
        }
        System.out.println("Output: " +rev);

        //Reverse String using while loop
        StringBuilder reversestr = new StringBuilder();
        int i = ch.length-1;
        while (i>=0){
            reversestr.append(ch[i]);
            i--;
        }
        System.out.println("Output: "+reversestr);

        //Reverse String using do while loop
        StringBuilder rstr = new StringBuilder();
        int j = ch.length-1;
        do{
            rstr.append(ch[j]);
            j--;
        }while (j>=0);
        System.out.println("Output: " +rstr);
    }
}
