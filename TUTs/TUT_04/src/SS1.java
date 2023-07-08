import java.util.Arrays;
import java.util.Scanner;

public class SS1 {
    public static void main(String[] args) {
        double [] marks = new double[10];
        double [] late = new double[marks.length];

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter Mark");
            if(in.hasNextDouble()){
                marks [i] = in.nextDouble();
                late[i] = (marks[i] - marks[i]/10); 
            }
            else {
                System.out.println("Invalid input");
            }
        }

        System.out.println(Arrays.toString(late));
        in.close();
    }
}

/**
 * Write a program that reads in and stores 10 student marks and then reduceseach mark by 10% 
 * (because it was 24 hours late). Use a loop to reduce eachmark. Each reduced mark is then stored in the same 
 * element of the array. Youshould then output the contents of the array
 */