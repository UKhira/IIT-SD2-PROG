import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);
        
        System.out.print("Enter Age: ");
        int age = ageInput.nextInt();

        if (age >= 18) {
            System.out.println("Over 18");
        }
        else if (age < 0) {
            System.out.println("The age entered is incorrect");
        }
        else{
            System.out.println("Under 18");
        }
        ageInput.close();
    }
}
