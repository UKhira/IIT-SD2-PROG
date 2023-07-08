import java.util.Scanner;

class Excercise5{
    public static void main(String[] args) {
        double marks [][] = new double [5][3];
        Scanner in = new Scanner(System.in);
        double sum = 0;
        for (int row = 0; row < marks.length; row++){
            for (int column = 0; column < marks[row].length; column++){
                System.out.println("Enter Mark");
                if(in.hasNextDouble()){
                    marks[row][column] = in.nextDouble();
                    sum += marks[row][column];
                }
                else {
                    System.out.println("Mark must be integer");
                }
            }
            System.out.println("\nAverage = " + sum / marks.length + "\n");
        }
        in.close();
    }
}

/**
 * Write a Java program that asks 3 marks (integers) of 5 students (each student willhave 3 marks). 
 * Use a multi-dimensional array to store the marks and find the averageof each student
 */