import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        final double ABSOLUTE_TEMPERATURE = 50;

        Scanner tempInput = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        double temp = tempInput.nextDouble();

        if (temp > ABSOLUTE_TEMPERATURE) {
            System.out.println("Hot");
        }
        else {
            System.out.println("Cold");
        }
    }
}
