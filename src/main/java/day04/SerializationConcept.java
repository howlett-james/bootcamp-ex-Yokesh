package day04;

import java.io.*;

class People implements Serializable,Cloneable {
    int age;
    String name,designation;
    public People( String name, int age, String designation) {
        this.age = age;
        this.name = name;
        this.designation = designation;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class SerializationConcept {

    public static void main(String[] args){
        try{
            //Creating the object
            People p1 = new People("logan" , 22, "QA");
            People p = (People)p1.clone();

            //Creating stream and writing the object
            FileOutputStream FileOut=new FileOutputStream("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\dummy.txt");
            ObjectOutputStream out=new ObjectOutputStream(FileOut);
            out.writeObject(p1);
            out.writeObject(p);
            System.out.println( "Cloned Objects :" +p.name +" " +p.age +" "+p.designation);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}

        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\dummy.txt"));
            People p2=(People) in.readObject();

            //printing the data of the serialized object
            System.out.println(p2.name+" "+p2.age +" " +p2.designation);

            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }


}

