import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] marks = new double [10];
        int sum = 0, count = 0;

        for (int el = 0; el < marks.length; el++){
            System.out.println("Enter Mark");

            if (in.hasNextDouble()){
                marks[el] = in.nextDouble();
                sum += marks[el];

                if(marks[el] < 40){
                    count++;
                }
            }
            else {
                System.out.println("Invalid");
            }

        }
        System.out.println(count + " students have been failed.");
        System.out.println("Average = " + sum / marks.length);

        in.close();
    }
}

/**
 * Write a program that creates an array of integers with dimension 10 (10 positions). Ask the user to introduce 
 * 10 marks and store them in the array. Then, display the 10 valuesin the array and calculate the number of 
 * students who have failed (mark lower than40) and the average mark. Print the number of students who have 
 * failed and the average.
 */
