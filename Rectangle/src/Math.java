import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int l = in.nextInt();
        System.out.println("Enter width");
        int w = in.nextInt();
        System.out.println("Enter color");
        String c = in.next();

        rec1.setData(l, w, c);
        System.out.printf("Rec1 width is %d. length is %d. color is %s.", rec1.width, rec1.length, rec1.color);

        System.out.println("\nArea = " + rec1.calcArea());
        in.close();
    }
}

