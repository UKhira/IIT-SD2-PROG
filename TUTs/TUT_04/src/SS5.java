import java.util.Arrays;
import java.util.Scanner;

class SS5 {
    static double [] values = {23, 34, 56, 677, 67, 60, 76, 87, 7, 65, 565, 565, 62, 77, 44, 33, 22, 9, 78, 21};
    public static void main(String[] args) {
        int i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position of fist number you want to swap");
        if(in.hasNextInt()) {
            i = in.nextInt();

            if( i <= values.length ){
                in.nextLine();
                System.out.println("Enter the position of other number");

                if(in.hasNextInt()){
                    j = in.nextInt();

                    if( j <= values.length ){
                        swap(i,j); 
                        System.out.println("Original Array " + Arrays.toString(values));                       
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

    private static void swap(int i,int j){
        double copy [] = Arrays.copyOf(values, values.length);
        copy[i-1] = values[j-1];
        copy[j-1] = values[i-1];

        System.out.println("Modified Array" + Arrays.toString(copy));

    }
}

/**
 * Write a program where an array of length 20 say is filled with doubles. 
 * The userthen inputs any two integer values i and j and the values in the array positions iand j are swapped 
 * around. The program should then print out the contents of thearray. 
  
 * Extend your answer above. You need to write a method (function) called swap().swap() accepts two integer 
 * parameters and swaps the contents of an array andthose locations. This method does not return a value. 
 * Implement this method intoa suitable java program by demonstrating how the method changes the contents of 
 * the array.
 */