/**
 * This program will output the sum of squares of integers from 1 to 10
 */

public class doWhile {
    public static void main(String[] args) {
        int start = 1, sum = 0;
        do{
            sum += (start * start);
            start++;
        }
        while (start < 11);
        System.out.println(sum);
    }
}
