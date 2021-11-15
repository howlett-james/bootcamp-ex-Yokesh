package DesignPatterns.SingletonPattern;

class DataBase{
    private static DataBase db;

    private DataBase(){

    }
    public static DataBase getInstance(){
        if(db == null){
            db = new DataBase();
        }
        return db;
    }
    public void getConnection(){
        System.out.println("You're connected to the DataBase");
    }

}

public class Singleton {
    public static void main(String[] args) {
        DataBase dataBase = DataBase.getInstance();
        dataBase.getConnection();
    }
}

