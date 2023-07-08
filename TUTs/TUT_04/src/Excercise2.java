import java.util.Arrays;
import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] values = {12, 32, 43, 56, 67, 78, 23, 45, 56, 77};
        double [] swapped = Arrays.copyOf(values,10);
        
        System.out.println("Enter the position of fist number you want to swap");
        if(in.hasNextInt()) {
            int i = in.nextInt();

            if( i <= values.length ){
                in.nextLine();
                System.out.println("Enter the position of other number");

                if(in.hasNextInt()){
                    int j = in.nextInt();

                    if( j <= values.length ){
                        swapped[i-1] = values[j-1];
                        swapped[j-1] = values[i-1];

                        System.out.println("Original Array " + Arrays.toString(values));
                        System.out.println("Modified Array" + Arrays.toString(swapped));

                    }
                    else {
                        System.out.println("Out of bound");
                    }
                }
            }
            else {
                System.out.println("Out of bound");
            }
            
        }
        else {
            System.out.println("Invalid Position");
        }
        in.close();
    }
}

/**
 * Write a program where an array of length 10 is filled with doubles. The user then inputs 2 integer values 
 * i and j and the values in the array position i and j are swapped around.The program should then print out 
 * the contents of the array. What happens if i or j arelarger than 10?
 */
