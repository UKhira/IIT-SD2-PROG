import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner monthInput = new Scanner(System.in);
        System.out.println("Enter a month name: ");
        String month = monthInput.next();

        int days = 0;
        switch (month) {
            case "January":  days = 31; break;

            case "February": 
            System.out.println("Enter year : ");
            int year = monthInput.nextInt();
            int test = year % 4;
            System.out.println(test);
            switch(test) {
                case 0 : days = 29; break;
                default : days = 28; break;
            }
            case "March" : days = 31; break;

        }
        System.out.println(days);
    }
}
