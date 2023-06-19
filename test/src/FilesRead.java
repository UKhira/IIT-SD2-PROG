// Read data from a file

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesRead {
    public static void main(String[] args) {
        try {
            File file = new File("text2.txt");
            Scanner file_reader = new Scanner(file);
            while (file_reader.hasNextLine()) {
                String text = file_reader.nextLine();
                System.out.println(text);
            }
            file_reader.close();
        }
        catch(IOException e) {
            System.out.println("Error while reading file");
            e.printStackTrace();
        }
    }
}
