import java.util.Scanner;
public class question1 {

    public static void main(String[] args) {

        Scanner inputNames = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name = inputNames.nextLine();

        System.out.println("Enter your surname: ");
        String surName = inputNames.nextLine();

        System.out.printf("%s%s", name.substring(0,1), surName.substring(0,1));
    }

    

}