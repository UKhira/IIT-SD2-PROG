import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            System.out.println("A lowercase character");
        }
        else if (letter >= 'A' && letter <= 'Z') {
            System.out.println("An uppercase character");
        }
        input.close();
    }
}
