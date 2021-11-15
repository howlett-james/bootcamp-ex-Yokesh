package day01;

public class ReverseString  {
    public static void main(String[] args) {

        //First Method -- dlroW olleH
        String str = "Hello World";
        char[] ch =str.toCharArray();
        StringBuilder rev= new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            rev.append(ch[i]);
        }
        System.out.println("Output: " +rev);

        //Second Method -- dlroW olleH
        String[] splitted = str.split(" {2}");
        StringBuilder temp= new StringBuilder();
        for(int i=0;i<splitted.length;i++){
            String split1 = splitted[i];
            for(int j=split1.length()-1;j>=0;j--){
                temp.append(split1.charAt(j));
            }
        }
        System.out.println("Output: " +temp);

        //Third Method -- World olleH
        String[] str1 = str.split(" ");
        String string1 = str1[1];
        StringBuilder stringBuilder = new StringBuilder(str1[0]);
        System.out.println("Output: "+ string1 +" "+ stringBuilder.reverse());

    }
}
