import java.util.Scanner;;

public class markAverage {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int mark_1, mark_2, mark_3;

        System.out.println("Enter First Mark:");
        mark_1 = obj1.nextInt();
        System.out.println("Enter Second Mark:");
        mark_2 = obj1.nextInt();
        System.out.println("Enter Third Mark:");
        mark_3 = obj1.nextInt();

        double average = (mark_1 + mark_2 + mark_3)/ 3;
        System.out.println(average);
    }
}
