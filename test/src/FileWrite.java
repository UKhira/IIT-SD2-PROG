// Write Data to the file
import java.io.FileWriter;          // Import the FileWriterclass
import java.io.IOException;         // Import the IOExceptionclass to handle errors or(java.io.*)

public class FileWrite {
    public static void main(String[] args) {
       try {
        FileWriter myWriter = new FileWriter("filewrite.txt");
        myWriter.write("This is what I want to write in my file !");
        myWriter.close();
        System.out.println("Successfully wrote to the file");
       }
       catch(IOException w){
        System.out.println("An error occured");
       }
    }
}
