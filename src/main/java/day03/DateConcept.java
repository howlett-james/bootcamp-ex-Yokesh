package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateConcept {
    public static void main(String[] args){
        String oldDate = "22-10-2021";
        System.out.println("Date before Addition: "+oldDate);
        //Specifying date format that matches the given date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        try{
            //Setting the date to the given date
            c.setTime(sdf.parse(oldDate));
        }catch(ParseException e){
            e.printStackTrace();
        }
        //Number of Days to add
        c.add(Calendar.DAY_OF_MONTH, 21);
        //Number of Days to subtract
//        c.add(Calendar.DAY_OF_MONTH, -21);
        String AddDate = sdf.format(c.getTime());
//        String SubDate = sdf.format(c.getTime());
        //Displaying the new Date after addition of Days
        System.out.println("Date after Addition: "+AddDate);
//        System.out.println("Date after Subtraction: " +SubDate);
    }
}
