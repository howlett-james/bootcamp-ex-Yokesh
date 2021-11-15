package DesignPatterns.SingletonPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class JDBC{
    private static JDBC jdbc;

    private JDBC(){}

    public static JDBC getInstance(){
        if(jdbc == null){
            jdbc = new JDBC();
        }
        return jdbc;
    }
    private static Connection getConnection() throws Exception{
        Connection con ;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users","root","Logan@210899");
        return con;
    }
    //Insert data into the Database
    public int Insert(String name, String pass) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        int recordCounter = 0;

        try {
            c = getConnection();
            ps = c.prepareStatement("insert into userData(uName,uPassword)values(?,?)");
            ps.setString(1,name);
            ps.setString(2,pass);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }
    //View the data from the Database
    public void View(String name) throws SQLException{
        Connection con = null;
        PreparedStatement ps =null;
        ResultSet rs = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("select * from userData where uName = ?");
            ps.setString(1,name);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println("ID = " +rs.getString(1) +"\t" +"Name = "+rs.getString(2)+"\t"+"Password = " +rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(rs != null){
                rs.close();
            }if (ps != null){
                ps.close();
            }if (con != null){
                con.close();
            }
        }
    }
    //update the Password for the given username
    public int Update(String name, String password) throws SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            con = getConnection();
            ps = con.prepareStatement("update userData set uPassword = ? where uName =" +name +" ");
            ps.setString(1,password);
            recordCounter = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(ps != null){
                ps.close();
            }if (con != null){
                con.close();
            }
        }
        return recordCounter;
    }
    //Delete the data from the Database
    public int Delete(int ID) throws SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        int recordCounter =0;
        try {
            con = getConnection();
            ps = con.prepareStatement("delete from userData where uID ="+ID+"");
            recordCounter = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (ps != null){
                ps.close();
            }if (con != null){
                con.close();
            }
        }
        return recordCounter;
    }
}

public class SingletonJDBC {
    static int count =1;
    static int choice;

    public static void main(String[] args) throws Exception {
        JDBC jdbc = JDBC.getInstance();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("DATABASE OPERATIONS:");
            System.out.println("--------------------------");
            System.out.println("1. Insert");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");

            System.out.println("\n Please enter the choice whcih you want to perform in the database: ");
            choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1: {
                    System.out.println("Enter the Username you want to insert data into the databaase");
                    String username = reader.readLine();
                    System.out.println("Enter the Password you want to insert data into the database");
                    String password = reader.readLine();

                    try {
                        int i = jdbc.Insert(username, password);
                        if (i > 0)
                            System.out.println((count++) + "Data has been inserted successfully");
                        else
                            System.out.println("Data has not been inserted");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Press any key to continue.....");
                    System.in.read();
                }
                break;

                case 2: {
                    System.out.println("Enter the Username: ");
                    String username = reader.readLine();

                    try {
                        jdbc.View(username);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("Press any key to continue.....");
                    System.in.read();
                }
                break;
                case 3:{
                    System.out.println("Enter the UserID, you want to delete: ");
                    int userID = Integer.parseInt(reader.readLine());

                    try {
                        int i = jdbc.Delete(userID);
                        if (i>0)
                            System.out.println((count++)+"Data has been deleted successful");
                        else
                            System.out.println("Data has not been deleted");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("Press any key to continue.....");
                    System.in.read();
                }
                break;
                case 4:{
                    System.out.println("Enter the username, you want to update: ");
                    String username = reader.readLine();
                    System.out.println("Enter New Password: ");
                    String password = reader.readLine();

                    try {
                        int i =jdbc.Update(username,password);
                        if (i>0){
                            System.out.println((count++)+"Data has been updated successfully");
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("Press any key to continue.....");
                    System.in.read();
                }
                break;
                default:
                    return;
            }
        }while (choice!=4);
    }
}