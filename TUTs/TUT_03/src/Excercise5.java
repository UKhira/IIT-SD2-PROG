import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        int sum1 = 0 , sum2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        sum1 += sum2;
        int start = 0;
        while (start <= n){
            sum2 = sum1;
            sum1 += sum2;
            start++;
        }
        System.out.println("Total = " + sum1);
        input.close();
    }
}
