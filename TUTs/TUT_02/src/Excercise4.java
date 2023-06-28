import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner markInput = new Scanner(System.in);

        System.out.print("Enter Mark: ");
        int mark = markInput.nextInt();

        if (mark < 25) {
            System.out.println("F");
        }
        else if (mark < 45){
            System.out.println("E");
        }    
        else if (mark < 50) {
            System.out.println("D");
        }
        else if (mark < 60) {
            System.out.println("C");
        }
        else if (mark <= 80) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }
        markInput.close();
    }
}
