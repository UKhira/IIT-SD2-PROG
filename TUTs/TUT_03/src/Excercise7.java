import java.util.Scanner;
import java.util.Random;

public class Excercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int ranNum = random.nextInt(20);
        int num;
        do {
            System.out.print("Enter a number between 1 and 20: ");
            num = input.nextInt();
        }
        while(num != ranNum);
        System.out.println("Correct Secret number is " + ranNum);
        input.close();
    }
}
