package day04;

import java.io.*;

public class FileIOConcept {
    public static void main(String[] args) {
        //InputStream
        System.out.println("INPUT STREAM CONCEPT");
        byte[] array = new byte[44];
        try {
            InputStream fis = new FileInputStream("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\sample.txt");
            System.out.println("Available bytes in the file: " + fis.available());

            // Read byte from the input stream
            fis.read(array);
            // Convert byte array into string
            String data = new String(array);
            System.out.println("Data read from the file: " +data);

            // Close the input stream
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //OutputStream
        System.out.println("OUTPUT STREAM CONCEPT");
        String data = "Java is Object Oriented Programming Language.";

        try {
            OutputStream out = new FileOutputStream("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\output.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
        //Reader
        System.out.println("READER Concept");
        // Creates an array of character
        char[] arr = new char[44];

        try {
            // Creates a reader using the FileReader
            Reader input = new FileReader("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\sample.txt");

            // Checks if reader is ready
            System.out.println("Is there data in the stream?  " + input.ready());

            // Reads characters
            input.read(arr);
            System.out.print("Data in the stream is : " );
            System.out.print(arr);

            // Closes the reader
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }

        //Writer
        System.out.println("WRITER CONCEPT");
        String str = "This is the data in the output file";

        try {
            // Creates a Writer using FileWriter
            Writer output = new FileWriter("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\output.txt");


            // Writes string to the file
            output.write(str);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
        //Delete a File
        try
        {
            File f= new File("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\dummy.txt");           //file to be delete
            if(f.delete())                      //returns Boolean value
            {
                System.out.println(f.getName() + " deleted");   //getting and printing the file name
            }
            else
            {
                System.out.println("failed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //Create a File
        File file = new File("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\dummy.txt"); //initialize File object and passing path as argument
        boolean result;
        try
        {
            result = file.createNewFile();  //creates a new file
            if(result)      // test if successfully created a new file
            {
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();    //prints exception if any
        }
    }
}
