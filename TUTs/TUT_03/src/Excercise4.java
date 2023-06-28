import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int times = input.nextInt();
        System.out.print("Enter a letter: ");
        String letter = input.next();

        int count = 0;
        while(count < times){
            System.out.print(letter);
            count++;
        }
        input.close();
    }
}
