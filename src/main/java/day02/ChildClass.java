package day02;

public class ChildClass extends ParentClass{
    public ChildClass(){
        System.out.println("Child Class Constructor");
    }
    public ChildClass(String str){
        super(str);
    }
    public ChildClass(String str1, String str2){
        super(str1,str2);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        ChildClass obj1 = new ChildClass("MadaM");
        ChildClass obj2 = new ChildClass("MadaM","madam");
    }
}
