package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPractice {
    public static void main(String[] args) throws SQLException {
        //Create Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_App","root","Logan@210899");

        //Create & Execute Query
        Statement statement = con.createStatement();
        String s = "insert into jobs values('HR', 'Human Resource',3000,7000);";
//        String s = "update employees set employee_name = 'Jaden Smith' where employee_number=008";
//        String s = "delete from employees where employee_number=005";

        statement.execute(s);

        //Close Connection
        con.close();

        System.out.println("Query Executed ........");
    }
}
