import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();

        double total = num1 + num2;
        System.out.println("Total = " + total);

        input.close();
    }
}
