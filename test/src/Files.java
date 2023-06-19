// Craeting a file

import java.io.File;
import java.io.IOException;
public class Files {
    public static void main(String[] args) {
        try {
            File file = new File("text.txt");
            boolean file_created = file.createNewFile();
            if (file_created) {
                System.out.println("File Created: " + file.getName());
            }
            else {
                System.out.println("Error while creating file: " + file.getName());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
