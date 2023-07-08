import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        String students [] = new String [10];
        double scores [] = new double [10];

        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < students.length; i++){
            System.out.println("Enter Student Name");
            students[i] = in.next();
            System.out.println("Enter Score");
            if(in.hasNextDouble()){
                scores[i] = in.nextDouble();
                sum += scores[i];
            }
            else {
                System.out.println("Score must be integer");
            }
        }
        double avg = sum/students.length;
        System.out.println("Overall Average = " + avg);
       
        for (String name: students){
            System.out.print(name + " ");
        }
        System.out.println();

        for (double score: scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
       
        in.close();
    }
}
