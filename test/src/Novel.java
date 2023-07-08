import java.util.Scanner;
/**
 * program to read the number of novels you have as an integer.
    * If it is greater than 20 – display "Wow!"
    * If it is less than or equals to 20 – display "Not Bad"
    * If it is equal to zero – display "Buy One Now!!"
*/
public class Novel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of novels you have read");
        if (in.hasNextInt()){
            int count = in.nextInt();
            if (count > 20){
                System.out.println("Wow !");
            }
            else if (count > 0) {
                System.out.println("Not Bad");
            }
            else {
                System.out.println("Buy One Now !!");
            }
        }
        in.close();
    }
}
