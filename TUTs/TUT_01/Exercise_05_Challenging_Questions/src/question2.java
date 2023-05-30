import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter value in meteres: ");
        double meter = userInput.nextDouble();

        double centimeters = meter * 100;

        System.out.println((int)centimeters + "cm");
    }
}
