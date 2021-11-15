package JDBCPractice;

import java.sql.*;

public class JDBCSelectConcept {
    public static void main(String[] args) throws SQLException {
        //Create Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_App","root","Logan@210899");

        //Create Query
        Statement statement = con.createStatement();
        String s ="select * from employees where EMPLOYEE_ID =107";

        //Execute Query & Store data in ResultSet
        ResultSet result =  statement.executeQuery(s);
        while (result.next()){
            int eid = result.getInt("EMPLOYEE_ID");
            String eFname = result.getString("FIRST_NAME");
            String eLname = result.getString("LAST_NAME");
            String eEmail = result.getString("EMAIL");
            System.out.println(eid +" "+eFname +" "+eLname +" "+eEmail);
        }

        //Close Connection
        con.close();

        System.out.println("Query Executed ........");
    }
}
