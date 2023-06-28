import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        int number, count;
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        number = input.nextInt();
        count = 0;
        while (count < number) {
            count++;
            factorial = factorial * count;
        }
        System.out.println(factorial);
        input.close();
    }
}
