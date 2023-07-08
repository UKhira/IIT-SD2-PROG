import java.util.Scanner;

public class SS2 {
    public static void main(String[] args) {
        double val [] = new double [10];
        Scanner in = new Scanner(System.in);

        int index = 0;
        double max = 0;

        while (index < 10){
            System.out.println("Enter a number");
            if(in.hasNextDouble()){
                val[index] = in.nextDouble();
                if(max < val[index]){
                    max = val[index];
                }
                index++;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
        in.close();
        System.out.println(max);
    }
}

/**
 * Write a program that reads in 100 doubles and stores them in an array callednums. 
 * The program should then print out the largest number.
 */
