package DesignPrinciples;

public class DRY_YAGNI {
    // Java Program without DRY approach

    public void CSE()
    {
        System.out.println("This is computer science");
        college(); //DRY Approach
    }
    public void college()
    {
        System.out.println("IIT - Madras");
    }
    public void ECE()
    {
        System.out.println("This is electronics");
        college();
    }
    public void college1() // YAGNI approach
    {
        System.out.println("IIT - Madras");
    }
    public void IT()
    {
        System.out.println("This is Information Technology");
        college();
    }
    public void college2()
    {
        System.out.println("IIT - Madras");
    }
    public static void main(String[] args)
    {
        DRY_YAGNI s = new DRY_YAGNI();
        s.CSE();
//        s.college();  --- without DRY Approach
        s.ECE();
//        s.college1();
        s.IT();
//        s.college2();
    }
}
