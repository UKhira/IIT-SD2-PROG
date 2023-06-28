import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        int number, power, count;
        int total = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        number = input.nextInt();
        System.out.println("Enter Power: ");
        power = input.nextInt();
        count = 0;

        while(count < power) {
            total = total * number;;
            count++;
        }
        System.out.println("The answer is " + total);
        input.close();
    }
}
