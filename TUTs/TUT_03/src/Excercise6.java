import java.util.Scanner;

public class Excercise6{
    public static void main(String[] args) {
        Scanner passcode = new Scanner(System.in);
        for (int attempts = 1; attempts < 5; attempts++){
            System.out.println("Enter Passcode");
            int password = passcode.nextInt();
            if(password == 486251) {
                System.out.println("Correct Password");
                break;
            }
            else {
                System.out.println("Incorrect Password");
            }
        }       
        passcode.close();
    }
}