import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner tempInput = new Scanner (System.in);

        System.out.println("Enter centigrade value:");
        double centigradeDegree = tempInput.nextDouble();

        double fahrenheitsDegree = (9.0 / 5) * centigradeDegree + 32;
        System.out.printf("%fF", fahrenheitsDegree);
    }
}
