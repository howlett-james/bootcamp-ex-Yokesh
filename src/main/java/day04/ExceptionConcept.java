package day04;

public class ExceptionConcept {
    public static void main(String[] args) throws Throwable {
        //Unchecked Exception -- ArrayIndexOutOfBoundsException
        String inpuArray[] = new String[5];
        inpuArray[0] = "adam";
        inpuArray[1] = "bobby";
        inpuArray[2] = "claudia";
        inpuArray[3] = "daniel";
        inpuArray[4] = "fred";

        System.out.println( inpuArray[6]);

        //Checked Exception
        //Custom Exception
        System.out.println("ABC");
        try {
            throw new Exception("Logan Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        throw new Exception("Logan Exception");
        System.out.println("PQR");


        String Exec_Flag = "N";
        if(Exec_Flag.equals("N")){
            try {
                throw new Exception("Execution flag is NO Exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            int i=9/0; //this code will throw an exception
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Hey --  this / by zero error");
        }
        System.out.println("ABC");

        //Re-Throw Exception
        try {
            test2();
        } catch(Exception e) {
            System.out.println("Caught in main");
        }
    }

    public static void test1() throws Exception {
        System.out.println("The Exception in test1() method");
        throw new Exception("thrown from test1() method");
    }
    public static void test2() throws Throwable {
        try {
            test1();
        } catch(Exception e) {
            System.out.println("Inside test2() method");
            throw e;
        }
    }
}
